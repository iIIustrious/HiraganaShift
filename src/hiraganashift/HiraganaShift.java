/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hiraganashift;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

/**
 *
 * @author Jack
 */
public class HiraganaShift {

    String output;
    String input;

    public HiraganaShift(){

    }

    public void go() throws IOException{
        String[] results = input.split("\n");
        Vector<Vector<String>> toFile = new Vector<Vector<String>>();
        Vector <Character> characters = new Vector();
        FileWriter fstream = new FileWriter(output);
        BufferedWriter outStream = new BufferedWriter(fstream);

        for(String str : results){
            System.out.println("array :" + str);
        }
        toFile.add( new Vector<String>());
        toFile.add( new Vector<String>());
        toFile.add( new Vector<String>());
        toFile.add( new Vector<String>());
        toFile.add( new Vector<String>());
        for(String str : results){
            String[] entries = str.split(" ");
            characters = getVector(entries);
            for(Character chr : characters){
                System.out.println("coords in char " + chr.y + chr.x);
            }
            for(int i = 0; i < 5; i++){
            for(Character chr : characters){
                if(chr.y == 10){
                    chr.x = chr.x +2;
                }
                else if(chr.y == 8)
                {
                    chr.x = chr.x + 2;
                }
                else{
                    chr.x = chr.x + 1;
                }

                if(chr.x > 5){
                    chr.x = 1;
                }
            }
            toFile.elementAt(i).add(out(characters));
        }
            
        }
        
       
         for(Vector<String> vec : toFile){
            for(String str : vec){
                outStream.write(str);
                outStream.newLine();
            }
            outStream.newLine();
            outStream.newLine();
            outStream.flush();
        }

        
        
        fstream.close();
    }

    private Vector<Character> getVector(String[] results){
        Vector <Character> chars = new Vector<Character>();
        for(int i = 0; i < results.length; i++){
            chars.add(whichChar(results[i]));
        }

        return chars;
    }

    private Character whichChar(String str){
        Character character;
        int value;

        try{
         value = Integer.parseInt(str.trim());
         System.out.println("value = " + value);
        }catch(NumberFormatException ex){value = 0;}

        switch (value) {
            case 11: character = new Character(1,2);
            break;

            case 12: character = new Character(9,5);
            break;

            case 13: character = new Character(6,1);
            break;

            case 14: character = new Character(5,2);
            break;

            case 15: character = new Character(6,5);
            break;

            case 16: character = new Character(6,4);
            break;

            case 17: character = new Character(4,5);
            break;

            case 21: character = new Character(4,2);
            break;

            case 22: character = new Character(9,2);
            break;

            case 23: character = new Character(5,3);
            break;

            case 24: character = new Character(9,3);
            break;

            case 25: character = new Character(10,5);
            break;

            case 26: character = new Character(10,1);
            break;

            case 27: character = new Character(2,1);
            break;

            case 31: character = new Character(8,5);
            break;

            case 32: character = new Character(4,1);
            break;

            case 33: character = new Character(9,4);
            break;

            case 34: character = new Character(3,5);
            break;

            case 35: character = new Character(4,3);
            break;

            case 36: character = new Character(5,4);
            break;

            case 37: character = new Character(5,1);
            break;

            case 41: character = new Character(9,1);
            break;

            case 42: character = new Character(7,3);
            break;

            case 43: character = new Character(1,3);
            break;

            case 44: character = new Character(1,2);
            break;

            case 45: character = new Character(5,5);
            break;

            case 46: character = new Character(1,5);
            break;

            case 47: character = new Character(2,3);
            break;

            case 51: character = new Character(8,1);
            break;

            case 52: character = new Character(7,1);
            break;

            case 53: character = new Character(2,4);
            break;

            case 54: character = new Character(6,3);
            break;

            case 55: character = new Character(2,5);
            break;

            case 56: character = new Character(1,4);
            break;

            case 57: character = new Character(4,4);
            break;

            case 61: character = new Character(1,1);
            break;

            case 62: character = new Character(3,1);
            break;

            case 63: character = new Character(2,2);
            break;

            case 64: character = new Character(8,3);
            break;

            case 65: character = new Character(7,4);
            break;

            case 66: character = new Character(7,2);
            break;

            case 67: character = new Character(3,2);
            break;

            case 71: character = new Character(1,4);
            break;

            case 72: character = new Character(6,2);
            break;

            case 73: character = new Character(7,5);
            break;

            case 74: character = new Character(3,4);
            break;

            case 75: character = new Character(3,3);
            break;

            case 76: character = new Character(10,3);
            break;

            default: character = new Character(0,0);
        }

        return character;
    }

    public String out(Vector<Character> chars) throws IOException{
        String out = "";
       
        for(Character character : chars){
            out = out + getChar(character) + " ";
        }
        System.out.println(" in out " + out);
        return out;

    }

    private String getChar(Character character){
        String out = "";

        switch (character.y){
            case 1: switch (character.x){
                case 1: out = "a";
                break;

                case 2: out = "i";
                break;

                case 3: out = "u";
                break;

                case 4: out = "e";
                break;

                case 5: out = "o";
                break;

            }
            break;

            case 2: switch (character.x){
                case 1: out = "ka";
                break;

                case 2: out = "ki";
                break;

                case 3: out = "ku";
                break;

                case 4: out = "ke";
                break;

                case 5: out = "ko";
                break;


            }
          break;

          case 3: switch (character.x){
                case 1: out = "sa";
                break;

                case 2: out = "shi";
                break;

                case 3: out = "su";
                break;

                case 4: out = "se";
                break;

                case 5: out = "so";
                break;


            }
          break;

          case 4: switch (character.x){
                case 1: out = "ta";
                break;

                case 2: out = "chi";
                break;

                case 3: out = "tsu";
                break;

                case 4: out = "te";
                break;

                case 5: out = "to";
                break;


            }
          break;

          case 5: switch (character.x){
                case 1: out = "na";
                break;

                case 2: out = "ni";
                break;

                case 3: out = "nu";
                break;

                case 4: out = "ne";
                break;

                case 5: out = "no";
                break;


            }
          break;

          case 6: switch (character.x){
                case 1: out = "ha";
                break;

                case 2: out = "hi";
                break;

                case 3: out = "fu";
                break;

                case 4: out = "he";
                break;

                case 5: out = "ho";
                break;

            }
          break;

          case 7: switch (character.x){
                case 1: out = "ma";
                break;

                case 2: out = "mi";
                break;

                case 3: out = "mu";
                break;

                case 4: out = "me";
                break;

                case 5: out = "mo";
                break;

            }
          break;

          case 8: switch (character.x){
                case 1: out = "ya";
                break;

                case 2: out = "wat";
                break;

                case 3: out = "yu";
                break;

                case 4: out = "wat";
                break;

                case 5: out = "yo";
                break;

            }
          break;

          case 9: switch (character.x){
                case 1: out = "ra";
                break;

                case 2: out = "ri";
                break;

                case 3: out = "ru";
                break;

                case 4: out = "re";
                break;

                case 5: out = "ro";
                break;

            }
          break;

          case 10: switch (character.x){
                case 1: out = "wa";
                break;

                case 2: out = "wat";
                break;

                case 3: out = "n";
                break;

                case 4: out = "wat";
                break;

                case 5: out = "wo";
                break;

            }
          break;
        }
        System.out.println("out:" + out);
        return out;
    }

}
