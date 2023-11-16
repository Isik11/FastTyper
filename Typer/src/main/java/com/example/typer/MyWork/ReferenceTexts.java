package com.example.typer.MyWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;

public class ReferenceTexts {
public ArrayList<String> file1 = new ArrayList<>();
    public ArrayList<String> file2 = new ArrayList<>();
    public ArrayList<String> file3 = new ArrayList<>();
    public ArrayList<String> file4 = new ArrayList<>();
    public ArrayList<String> file5 = new ArrayList<>();
    public ArrayList<String> file6 = new ArrayList<>();
    public ArrayList<String> file7 = new ArrayList<>();
    public ArrayList<String> file8 = new ArrayList<>();
    public ArrayList<String> file9 = new ArrayList<>();
    public ArrayList<String> file10 = new ArrayList<>();


    public static String readFile(String filePath){
        StringBuilder content = new StringBuilder();

        try (BufferedReader buf = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = buf.readLine())  != null){
                content.append(line).append("\n");

            }
            } catch (IOException e ){
            e.printStackTrace();
        }
        return content.toString();
        }
    }


