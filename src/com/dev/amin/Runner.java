package com.dev.amin;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("By Mohammad Amin Rezaeizadeh - 963111134");
        while (true) {
            System.out.println("Enter the number of processes: ");
            System.out.println("(Type -1 to exit.)");
            int numberOfProcesses = sc.nextInt();
            if (numberOfProcesses == -1) break;

            int[] processes = new int[numberOfProcesses];
            int[] burstTime = new int[numberOfProcesses];

            for (int i = 0; i < numberOfProcesses; i++) {
                System.out.printf("Enter process number %d ", i + 1);
                processes[i] = sc.nextInt();
            }

            for (int i = 0; i < numberOfProcesses; i++) {
                System.out.printf("Enter burst time for process number" +
                        " %d \n", i + 1);
                burstTime[i] = sc.nextInt();
            }

            new FCFSImplementation().resolveAverageTime(numberOfProcesses,
                    processes, burstTime);
        }
    }
}
