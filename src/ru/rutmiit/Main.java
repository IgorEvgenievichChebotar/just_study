package ru.rutmiit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<BankAccount> accounts_list = new ArrayList<>();

        boolean exec = true;
        while (exec){
            String command = sc.nextLine();
            String[] commands_arr = command.split(" ");
            switch(commands_arr[0]){
                case "Create", "create":
                    BankAccount account = new BankAccount();
                    accounts_list.add(account);
                    System.out.println("Account ID" + account.getId() + " created");
                    break;
                case "Deposit", "deposit":
                    if(!accounts_list.isEmpty()){
                        accounts_list.get(Integer.parseInt(commands_arr[1])-1).deposit(Double.parseDouble(commands_arr[2]));
                        System.out.println("Deposited " + commands_arr[2] + " to ID" + commands_arr[1]);
                    }
                    break;
                case "SetInterest", "setInterest", "setinterest", "Setinterest":
                    if(!accounts_list.isEmpty()){
                        BankAccount.setInterestRate(Double.parseDouble(commands_arr[1]));
                    }
                    break;
                case "GetInterest", "getInterest", "getinterest", "Getinterest":
                    if(!accounts_list.isEmpty()){
                        if(Integer.parseInt(commands_arr[1]) <= accounts_list.size()){
                            System.out.println(accounts_list.get(Integer.parseInt(commands_arr[1])-1).getInterest(Integer.parseInt(commands_arr[2])));
                        }
                        else{
                            System.out.println("There is no such account");
                        }
                    }
                    break;
                case "End", "end":
                    exec = false;
                    break;
                default:
                    System.out.println("Unresolved command");
                    break;
            }
        }
    }
}