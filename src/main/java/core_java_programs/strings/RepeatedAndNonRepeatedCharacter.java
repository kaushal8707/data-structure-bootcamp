package com.example.strings;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class RepeatedAndNonRepeatedCharacter
{
    public static void main(String[] args)
    {
        String str="kaushal kumar singh";
        Set<Character> repeated=new HashSet<Character>();
        Set<Character> non_repeated=new HashSet<Character>();

        char chArr[]=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            int count=0;
            for(int j=0;j<str.length();j++)
            {
                if(chArr[i]==chArr[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                non_repeated.add(chArr[i]);
            }else
            {
                repeated.add(chArr[i]);
            }
        }
        Stream.concat(repeated.stream(),non_repeated.stream()).forEach(c->System.out.print(c+" "));

    }
}
