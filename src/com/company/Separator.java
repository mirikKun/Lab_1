package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Propety
{
     char separator;
     String plus;
     String pathTo;
     String pathFrom ;
     Propety()
    {
        separator = ',';
        plus = "+";
        pathTo = "text.csv";
        pathFrom = "result.txt";
    }
    Propety(String plas)
    {
        separator = ',';
        plus = plas;
        pathTo = "text.csv";
        pathFrom = "result.txt";
    }
    Propety(String to, String plas)
    {
        separator = ',';
        plus = plas;
        pathTo = to;
        pathFrom = "result.txt";
    }
    Propety(String to, String plas, String from)
    {
        separator = ',';
        plus = plas;
        pathTo = to;
        pathFrom = from;
    }
    Propety(String to, String plas, String from, char separ)
    {
        separator = separ;
        plus = plas;
        pathTo = to;
        pathFrom = from;
    }

}