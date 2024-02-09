package com.practice.javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumPlatforms {
    public static void main(String[] args) {
        int[] arrival ={900};// {900,905, 908, 907, 1100, 1500, 1800,1900,2000};
        int[] departure = {910};//{910,915, 909, 908, 1130, 1900, 2000, 1910,2010};
        System.out.println(findMinimumPlatforms(arrival,departure));
    }

    private static int findMinimumPlatforms(int[] arrival, int[] departure) {
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int numberOfTrains =1;
        int numberOfPlatforms=1;
        int j =0;
        int i =1;
        while(i<arrival.length){
                        if(departure[j]<arrival[i]){
                            j++;

                        numberOfTrains--;
                    }
                        else{
                            i++;
                            numberOfTrains++;
                        }
                    if(numberOfPlatforms<numberOfTrains){
                        numberOfPlatforms= numberOfTrains;
                    }
       }

        return numberOfPlatforms;
    }
}
