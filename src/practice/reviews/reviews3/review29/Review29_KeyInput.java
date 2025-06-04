package practice.reviews.reviews3.review29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
   public class Review29_KeyInput {
        public String readString () {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String inputStr = "";
            try {
                inputStr = br.readLine();
            } catch (IOException e) {
                System.out.println("Error IOExeption");
            }
            return inputStr;
        }
    }
