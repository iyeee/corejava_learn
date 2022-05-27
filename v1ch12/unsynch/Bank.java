package unsynch;

import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import javax.management.relation.RoleList;

/**
 * A bank with a number of bank accounts.
 */
public class Bank
{
   private final double[] accounts;
   private ReentrantLock rLock;
   private Condition sufficienFunds;

   /**
    * Constructs the bank.
    * @param n the number of accounts
    * @param initialBalance the initial balance for each account
    */
   public Bank(int n, double initialBalance)
   {
      accounts = new double[n];
      Arrays.fill(accounts, initialBalance);
      rLock=new ReentrantLock();
      sufficienFunds=rLock.newCondition();
   }

   /**
    * Transfers money from one account to another.
    * @param from the account to transfer from
    * @param to the account to transfer to
    * @param amount the amount to transfer
    * @throws InterruptedException
    */
   public void transfer(int from, int to, double amount) throws InterruptedException
   {
      rLock.lock();
      try{
      if (accounts[from] < amount) {
         sufficienFunds.await();
      }
      System.out.print(Thread.currentThread());
      accounts[from] -= amount;
      System.out.printf(" %10.2f from %d to %d", amount, from, to);
      accounts[to] += amount;
      System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
      sufficienFunds.signalAll();
      }
      finally{
         rLock.unlock();
      }
   }
 
   /**
    * Gets the sum of all account balances.
    * @return the total balance
    */
   public double getTotalBalance()
   {
      rLock.lock();
      try{
      double sum = 0;

      for (double a : accounts)
         sum += a;

      return sum;
      }
      finally{
         rLock.unlock();
      }
   }

   /**
    * Gets the number of accounts in the bank.
    * @return the number of accounts
    */
   public int size()
   {
      return accounts.length;
   }
}
