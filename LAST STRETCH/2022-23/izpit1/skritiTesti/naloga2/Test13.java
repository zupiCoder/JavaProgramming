
import java.util.*;

public class Test13 {

    public static void main(String[] args) {
        final char[][] B01 = {
            {'j'},
            {'h'},
            {'i'},
            {'e'},
            {'x'},
            {'h'},
            {'r'},
            {'s'},
            {'s'},
            {'k'},
            {'j'},
            {'t'},
            {'e'},
            {'v'},
            {'f'},
            {'s'},
            {'i'},
            {'e'},
            {'y'},
            {'x'},
            {'k'},
            {'t'},
            {'w'},
            {'t'},
            {'s'},
            {'u'},
            {'y'},
            {'j'},
            {'n'},
            {'m'},
            {'g'},
            {'t'},
            {'i'},
            {'y'},
            {'q'},
            {'d'},
            {'o'},
            {'z'},
            {'k'},
            {'e'},
            {'v'},
            {'f'},
            {'s'},
            {'t'},
            {'s'},
            {'d'},
            {'o'},
            {'b'},
            {'z'},
            {'l'},
            {'p'},
            {'a'},
            {'c'},
            {'y'},
            {'o'},
            {'h'},
            {'d'},
            {'h'},
            {'z'},
            {'d'},
            {'y'},
        };

        final char[][] P01 = {
            {'1', '1', 'n'},
            {'9', '6', 'v'},
            {'0', '9', 'v'},
            {'3', '1', 'v'},
            {'6', '7', 'n'},
            {'9', '9', 'v'},
            {'3', '3', 'n'},
            {'8', '8', 'n'},
            {'8', '8', 'n'},
            {'0', '2', 'n'},
            {'1', '5', 'n'},
            {'0', '5', 'v'},
            {'3', '9', 'v'},
            {'5', '5', 'v'},
            {'8', '4', 'v'},
            {'7', '9', 'v'},
            {'0', '4', 'v'},
            {'2', '2', 'v'},
            {'5', '1', 'v'},
            {'6', '7', 'n'},
            {'8', '9', 'n'},
            {'7', '3', 'v'},
            {'5', '0', 'n'},
            {'5', '4', 'v'},
            {'8', '8', 'v'},
            {'3', '5', 'n'},
            {'1', '9', 'n'},
            {'5', '6', 'n'},
            {'6', '5', 'v'},
            {'7', '4', 'n'},
            {'7', '6', 'n'},
            {'3', '8', 'n'},
            {'2', '4', 'v'},
            {'9', '3', 'n'},
            {'9', '1', 'n'},
            {'5', '2', 'v'},
            {'2', '9', 'n'},
            {'9', '0', 'v'},
            {'2', '3', 'v'},
            {'2', '2', 'n'},
            {'8', '0', 'v'},
            {'7', '5', 'n'},
            {'7', '9', 'v'},
            {'3', '8', 'n'},
            {'7', '9', 'v'},
            {'5', '2', 'n'},
            {'6', '8', 'n'},
            {'7', '0', 'v'},
            {'6', '1', 'n'},
            {'0', '7', 'n'},
            {'3', '7', 'v'},
            {'4', '1', 'v'},
            {'7', '2', 'n'},
            {'1', '4', 'v'},
            {'6', '6', 'v'},
            {'0', '0', 'v'},
            {'7', '8', 'n'},
            {'9', '2', 'n'},
            {'8', '7', 'n'},
            {'7', '8', 'n'},
            {'9', '3', 'v'},
        };

        final char[][] B02 = {
            {'a'},
            {'m'},
            {'m'},
            {'b'},
            {'i'},
            {'k'},
            {'r'},
            {'h'},
            {'b'},
            {'g'},
            {'v'},
            {'s'},
            {'l'},
            {'n'},
            {'c'},
            {'a'},
            {'c'},
            {'l'},
            {'k'},
            {'w'},
            {'o'},
            {'f'},
            {'f'},
            {'q'},
            {'t'},
            {'x'},
            {'v'},
            {'l'},
            {'f'},
            {'c'},
            {'g'},
            {'o'},
            {'d'},
            {'f'},
            {'w'},
            {'q'},
            {'l'},
            {'r'},
            {'i'},
            {'c'},
            {'k'},
            {'x'},
            {'l'},
            {'z'},
            {'l'},
            {'w'},
            {'y'},
            {'b'},
            {'y'},
            {'y'},
            {'c'},
            {'h'},
            {'k'},
            {'t'},
            {'c'},
            {'t'},
            {'x'},
            {'y'},
            {'t'},
            {'y'},
            {'c'},
        };

        final char[][] P02 = {
            {'5', '4', 'v'},
            {'3', '7', 'n'},
            {'3', '7', 'v'},
            {'4', '3', 'v'},
            {'3', '8', 'v'},
            {'2', '1', 'v'},
            {'9', '3', 'n'},
            {'1', '0', 'n'},
            {'4', '3', 'v'},
            {'3', '1', 'v'},
            {'7', '1', 'v'},
            {'6', '1', 'v'},
            {'1', '7', 'n'},
            {'5', '7', 'n'},
            {'7', '8', 'n'},
            {'2', '0', 'v'},
            {'8', '0', 'n'},
            {'3', '6', 'n'},
            {'2', '1', 'v'},
            {'6', '4', 'n'},
            {'6', '9', 'v'},
            {'3', '0', 'n'},
            {'2', '8', 'v'},
            {'1', '9', 'n'},
            {'3', '3', 'n'},
            {'2', '9', 'v'},
            {'0', '0', 'v'},
            {'7', '9', 'n'},
            {'2', '8', 'n'},
            {'0', '8', 'v'},
            {'3', '1', 'v'},
            {'0', '5', 'n'},
            {'0', '2', 'n'},
            {'9', '5', 'n'},
            {'7', '6', 'v'},
            {'1', '9', 'v'},
            {'4', '9', 'n'},
            {'1', '5', 'v'},
            {'3', '8', 'v'},
            {'2', '6', 'n'},
            {'2', '7', 'n'},
            {'2', '9', 'n'},
            {'8', '4', 'n'},
            {'7', '4', 'n'},
            {'1', '7', 'v'},
            {'6', '4', 'n'},
            {'1', '6', 'n'},
            {'4', '3', 'n'},
            {'8', '5', 'v'},
            {'2', '2', 'n'},
            {'2', '6', 'v'},
            {'5', '5', 'v'},
            {'2', '1', 'n'},
            {'6', '0', 'n'},
            {'2', '6', 'n'},
            {'8', '7', 'v'},
            {'6', '2', 'n'},
            {'1', '6', 'n'},
            {'6', '0', 'v'},
            {'1', '6', 'v'},
            {'0', '8', 'n'},
        };

        final char[][] B03 = {
            {'f'},
            {'g'},
            {'q'},
            {'b'},
            {'i'},
            {'o'},
            {'c'},
            {'q'},
            {'t'},
            {'f'},
            {'w'},
            {'y'},
            {'y'},
            {'t'},
            {'x'},
            {'x'},
            {'s'},
            {'e'},
            {'x'},
            {'z'},
            {'j'},
            {'e'},
            {'j'},
            {'v'},
            {'s'},
            {'w'},
            {'o'},
            {'l'},
            {'g'},
            {'j'},
            {'p'},
            {'q'},
            {'p'},
            {'e'},
            {'x'},
            {'w'},
            {'u'},
            {'x'},
            {'i'},
            {'x'},
            {'p'},
            {'n'},
            {'j'},
            {'s'},
            {'x'},
            {'y'},
            {'p'},
            {'d'},
            {'o'},
            {'y'},
            {'h'},
        };

        final char[][] P03 = {
            {'6', '1', 'n'},
            {'2', '7', 'v'},
            {'7', '4', 'v'},
            {'6', '2', 'n'},
            {'7', '0', 'v'},
            {'7', '3', 'v'},
            {'1', '9', 'n'},
            {'7', '4', 'v'},
            {'8', '5', 'n'},
            {'4', '8', 'n'},
            {'2', '9', 'v'},
            {'9', '2', 'v'},
            {'1', '5', 'v'},
            {'8', '5', 'n'},
            {'2', '8', 'n'},
            {'6', '9', 'v'},
            {'3', '7', 'n'},
            {'4', '0', 'v'},
            {'9', '0', 'v'},
            {'5', '7', 'n'},
            {'3', '1', 'v'},
            {'2', '6', 'n'},
            {'2', '0', 'n'},
            {'3', '4', 'n'},
            {'8', '7', 'n'},
            {'5', '0', 'v'},
            {'4', '4', 'n'},
            {'9', '3', 'n'},
            {'0', '8', 'n'},
            {'3', '1', 'v'},
            {'5', '8', 'v'},
            {'1', '1', 'n'},
            {'8', '6', 'v'},
            {'4', '0', 'v'},
            {'2', '8', 'v'},
            {'5', '0', 'v'},
            {'4', '9', 'n'},
            {'6', '9', 'v'},
            {'1', '2', 'n'},
            {'2', '8', 'n'},
            {'2', '5', 'n'},
            {'2', '1', 'v'},
            {'8', '4', 'n'},
            {'8', '7', 'v'},
            {'6', '3', 'n'},
            {'8', '8', 'v'},
            {'2', '5', 'v'},
            {'1', '7', 'v'},
            {'1', '8', 'v'},
            {'8', '3', 'n'},
            {'7', '6', 'v'},
        };

        final char[][] B04 = {
            {'i'},
            {'k'},
            {'h'},
            {'t'},
            {'l'},
            {'k'},
            {'e'},
            {'w'},
            {'o'},
            {'w'},
            {'o'},
            {'z'},
            {'i'},
            {'j'},
            {'k'},
            {'i'},
            {'v'},
            {'a'},
            {'m'},
            {'r'},
            {'i'},
            {'d'},
            {'j'},
            {'c'},
            {'o'},
            {'w'},
            {'v'},
            {'t'},
            {'c'},
            {'r'},
            {'m'},
            {'k'},
            {'w'},
            {'u'},
            {'j'},
            {'f'},
            {'f'},
            {'k'},
            {'i'},
            {'m'},
            {'a'},
            {'o'},
            {'z'},
            {'r'},
            {'v'},
            {'m'},
            {'d'},
            {'q'},
            {'l'},
            {'h'},
            {'p'},
            {'v'},
            {'j'},
            {'w'},
            {'i'},
            {'b'},
            {'j'},
            {'x'},
            {'v'},
            {'h'},
            {'e'},
            {'n'},
            {'m'},
            {'x'},
            {'e'},
            {'s'},
            {'j'},
            {'r'},
            {'a'},
            {'h'},
            {'i'},
            {'v'},
            {'j'},
            {'o'},
            {'l'},
            {'d'},
            {'a'},
            {'h'},
            {'s'},
            {'q'},
            {'h'},
            {'y'},
            {'p'},
            {'i'},
            {'j'},
            {'v'},
            {'a'},
            {'y'},
            {'i'},
            {'s'},
            {'a'},
            {'t'},
            {'z'},
            {'l'},
            {'r'},
            {'h'},
            {'t'},
        };

        final char[][] P04 = {
            {'2', '0', 'v'},
            {'4', '2', 'v'},
            {'2', '9', 'n'},
            {'6', '0', 'n'},
            {'0', '2', 'v'},
            {'4', '2', 'v'},
            {'6', '4', 'n'},
            {'9', '4', 'v'},
            {'8', '5', 'n'},
            {'4', '5', 'v'},
            {'3', '7', 'v'},
            {'5', '1', 'v'},
            {'2', '0', 'n'},
            {'4', '8', 'n'},
            {'4', '2', 'n'},
            {'7', '4', 'n'},
            {'9', '9', 'n'},
            {'1', '8', 'v'},
            {'6', '3', 'n'},
            {'9', '8', 'n'},
            {'7', '3', 'n'},
            {'9', '6', 'v'},
            {'8', '0', 'n'},
            {'0', '3', 'n'},
            {'3', '7', 'n'},
            {'8', '3', 'v'},
            {'9', '1', 'n'},
            {'3', '4', 'v'},
            {'0', '3', 'n'},
            {'6', '7', 'v'},
            {'6', '3', 'v'},
            {'4', '2', 'v'},
            {'4', '5', 'v'},
            {'4', '6', 'v'},
            {'7', '9', 'v'},
            {'1', '1', 'v'},
            {'0', '9', 'n'},
            {'5', '6', 'v'},
            {'2', '0', 'n'},
            {'7', '0', 'v'},
            {'3', '3', 'v'},
            {'1', '7', 'v'},
            {'0', '6', 'v'},
            {'6', '8', 'v'},
            {'9', '9', 'v'},
            {'8', '4', 'n'},
            {'5', '5', 'v'},
            {'0', '5', 'v'},
            {'8', '9', 'v'},
            {'5', '9', 'v'},
            {'6', '9', 'n'},
            {'6', '2', 'v'},
            {'7', '9', 'v'},
            {'8', '3', 'v'},
            {'7', '4', 'v'},
            {'2', '6', 'v'},
            {'8', '0', 'v'},
            {'6', '5', 'n'},
            {'6', '2', 'v'},
            {'5', '9', 'n'},
            {'4', '9', 'v'},
            {'3', '9', 'v'},
            {'1', '5', 'v'},
            {'6', '5', 'n'},
            {'3', '1', 'v'},
            {'5', '8', 'n'},
            {'4', '8', 'n'},
            {'5', '4', 'n'},
            {'1', '8', 'v'},
            {'8', '6', 'n'},
            {'7', '1', 'v'},
            {'9', '9', 'n'},
            {'4', '8', 'n'},
            {'4', '7', 'n'},
            {'0', '2', 'v'},
            {'5', '3', 'n'},
            {'3', '3', 'n'},
            {'7', '7', 'v'},
            {'5', '7', 'v'},
            {'0', '5', 'v'},
            {'0', '4', 'v'},
            {'1', '4', 'n'},
            {'1', '3', 'v'},
            {'7', '4', 'v'},
            {'4', '8', 'n'},
            {'4', '4', 'n'},
            {'3', '3', 'v'},
            {'1', '4', 'v'},
            {'7', '1', 'n'},
            {'3', '5', 'n'},
            {'6', '6', 'v'},
            {'3', '4', 'v'},
            {'0', '6', 'v'},
            {'8', '9', 'n'},
            {'6', '7', 'v'},
            {'2', '2', 'v'},
            {'6', '0', 'v'},
        };

        final char[][] B05 = {
            {'m'},
            {'c'},
            {'p'},
            {'q'},
            {'h'},
            {'i'},
            {'q'},
            {'z'},
        };

        final char[][] P05 = {
            {'4', '6', 'v'},
            {'4', '5', 'n'},
            {'4', '9', 'v'},
            {'0', '4', 'v'},
            {'0', '9', 'n'},
            {'9', '6', 'v'},
            {'0', '4', 'v'},
            {'1', '1', 'n'},
        };

        final char[][] B06 = {
            {'x'},
            {'y'},
            {'q'},
            {'j'},
            {'v'},
            {'o'},
            {'z'},
            {'n'},
            {'e'},
            {'j'},
            {'e'},
            {'y'},
            {'e'},
            {'t'},
            {'d'},
            {'q'},
            {'h'},
            {'x'},
            {'p'},
            {'y'},
            {'z'},
            {'s'},
            {'u'},
            {'b'},
            {'u'},
            {'h'},
            {'r'},
            {'n'},
            {'l'},
            {'f'},
            {'z'},
            {'e'},
            {'x'},
            {'d'},
            {'v'},
            {'e'},
            {'l'},
            {'l'},
            {'z'},
            {'h'},
            {'n'},
            {'n'},
            {'y'},
            {'u'},
            {'e'},
            {'t'},
            {'o'},
            {'h'},
            {'z'},
            {'z'},
            {'r'},
            {'d'},
            {'j'},
            {'l'},
            {'q'},
            {'x'},
            {'j'},
            {'v'},
            {'y'},
            {'v'},
            {'h'},
            {'x'},
        };

        final char[][] P06 = {
            {'8', '6', 'n'},
            {'8', '8', 'n'},
            {'9', '8', 'v'},
            {'9', '3', 'v'},
            {'0', '9', 'n'},
            {'2', '9', 'v'},
            {'5', '8', 'v'},
            {'6', '7', 'v'},
            {'4', '9', 'v'},
            {'9', '3', 'n'},
            {'4', '5', 'v'},
            {'9', '9', 'n'},
            {'4', '5', 'v'},
            {'3', '2', 'v'},
            {'6', '9', 'n'},
            {'3', '6', 'n'},
            {'5', '1', 'n'},
            {'3', '0', 'n'},
            {'6', '3', 'v'},
            {'9', '7', 'v'},
            {'8', '9', 'v'},
            {'4', '1', 'v'},
            {'4', '4', 'n'},
            {'7', '8', 'n'},
            {'4', '4', 'n'},
            {'6', '4', 'v'},
            {'7', '7', 'n'},
            {'8', '4', 'v'},
            {'4', '3', 'v'},
            {'8', '6', 'v'},
            {'0', '3', 'n'},
            {'5', '4', 'n'},
            {'3', '0', 'n'},
            {'6', '9', 'v'},
            {'6', '5', 'v'},
            {'5', '4', 'n'},
            {'1', '0', 'v'},
            {'6', '6', 'v'},
            {'0', '3', 'v'},
            {'1', '5', 'n'},
            {'1', '2', 'n'},
            {'6', '7', 'n'},
            {'9', '9', 'n'},
            {'4', '4', 'n'},
            {'5', '4', 'n'},
            {'3', '2', 'n'},
            {'7', '3', 'n'},
            {'0', '0', 'n'},
            {'4', '2', 'v'},
            {'4', '2', 'n'},
            {'5', '7', 'n'},
            {'1', '9', 'v'},
            {'1', '4', 'n'},
            {'4', '3', 'v'},
            {'9', '8', 'v'},
            {'3', '0', 'n'},
            {'1', '4', 'n'},
            {'2', '7', 'v'},
            {'8', '8', 'v'},
            {'0', '9', 'n'},
            {'0', '0', 'n'},
            {'5', '5', 'v'},
        };

        final char[][] B07 = {
            {'n'},
            {'m'},
            {'w'},
            {'b'},
            {'u'},
            {'l'},
            {'c'},
            {'t'},
            {'f'},
            {'k'},
            {'q'},
            {'j'},
            {'s'},
            {'j'},
            {'u'},
            {'v'},
            {'r'},
            {'j'},
            {'c'},
            {'h'},
            {'a'},
            {'g'},
            {'x'},
            {'s'},
            {'l'},
            {'m'},
            {'a'},
            {'m'},
            {'m'},
            {'q'},
            {'l'},
            {'r'},
            {'u'},
            {'o'},
            {'s'},
            {'p'},
            {'c'},
            {'f'},
            {'g'},
            {'i'},
            {'q'},
            {'s'},
            {'f'},
            {'p'},
            {'p'},
            {'p'},
            {'u'},
            {'d'},
            {'j'},
            {'q'},
            {'u'},
            {'m'},
            {'v'},
            {'o'},
            {'a'},
            {'m'},
            {'y'},
            {'q'},
            {'a'},
        };

        final char[][] P07 = {
            {'2', '8', 'n'},
            {'0', '6', 'v'},
            {'6', '9', 'v'},
            {'9', '3', 'n'},
            {'4', '7', 'n'},
            {'5', '8', 'n'},
            {'8', '4', 'n'},
            {'1', '4', 'v'},
            {'5', '0', 'n'},
            {'8', '5', 'n'},
            {'6', '7', 'v'},
            {'2', '4', 'n'},
            {'8', '8', 'v'},
            {'2', '4', 'v'},
            {'2', '2', 'n'},
            {'7', '1', 'n'},
            {'1', '6', 'n'},
            {'2', '4', 'n'},
            {'1', '9', 'n'},
            {'2', '5', 'v'},
            {'7', '4', 'n'},
            {'1', '5', 'v'},
            {'7', '6', 'v'},
            {'2', '6', 'n'},
            {'9', '5', 'n'},
            {'0', '6', 'v'},
            {'9', '9', 'v'},
            {'0', '6', 'n'},
            {'4', '0', 'v'},
            {'8', '3', 'v'},
            {'4', '4', 'n'},
            {'6', '2', 'n'},
            {'4', '7', 'n'},
            {'2', '0', 'n'},
            {'2', '6', 'v'},
            {'3', '8', 'n'},
            {'1', '9', 'v'},
            {'0', '1', 'v'},
            {'5', '4', 'n'},
            {'1', '8', 'n'},
            {'6', '7', 'v'},
            {'0', '2', 'v'},
            {'7', '0', 'n'},
            {'9', '8', 'v'},
            {'1', '1', 'n'},
            {'3', '8', 'v'},
            {'3', '0', 'v'},
            {'4', '9', 'v'},
            {'8', '1', 'n'},
            {'1', '0', 'n'},
            {'2', '2', 'n'},
            {'1', '3', 'v'},
            {'9', '1', 'v'},
            {'0', '8', 'n'},
            {'1', '2', 'v'},
            {'1', '3', 'n'},
            {'9', '0', 'n'},
            {'0', '4', 'n'},
            {'1', '2', 'v'},
        };

        final char[][] B08 = {
            {'k'},
            {'a'},
            {'r'},
            {'n'},
            {'r'},
            {'i'},
            {'s'},
            {'m'},
            {'e'},
            {'k'},
            {'u'},
            {'k'},
            {'a'},
            {'h'},
            {'e'},
            {'v'},
            {'p'},
            {'y'},
            {'c'},
            {'k'},
            {'l'},
            {'g'},
            {'e'},
            {'i'},
            {'a'},
            {'h'},
            {'y'},
            {'l'},
            {'o'},
            {'c'},
            {'x'},
            {'o'},
            {'y'},
            {'y'},
            {'i'},
            {'r'},
            {'y'},
            {'i'},
            {'w'},
            {'u'},
            {'d'},
            {'c'},
            {'z'},
            {'u'},
            {'y'},
            {'d'},
            {'l'},
            {'w'},
            {'z'},
            {'r'},
            {'u'},
            {'x'},
            {'c'},
            {'l'},
            {'r'},
            {'z'},
            {'c'},
            {'w'},
            {'z'},
            {'c'},
            {'y'},
            {'i'},
            {'n'},
            {'y'},
            {'z'},
            {'o'},
            {'i'},
            {'z'},
            {'d'},
            {'c'},
            {'c'},
            {'z'},
            {'z'},
            {'i'},
            {'k'},
            {'v'},
            {'k'},
            {'j'},
            {'y'},
            {'u'},
            {'r'},
            {'y'},
            {'a'},
            {'c'},
            {'i'},
            {'h'},
            {'z'},
            {'z'},
            {'z'},
            {'u'},
            {'v'},
            {'v'},
            {'l'},
            {'j'},
            {'n'},
            {'f'},
            {'h'},
            {'z'},
            {'k'},
            {'t'},
        };

        final char[][] P08 = {
            {'9', '9', 'v'},
            {'6', '2', 'v'},
            {'5', '3', 'n'},
            {'8', '4', 'v'},
            {'1', '5', 'v'},
            {'8', '8', 'v'},
            {'2', '3', 'n'},
            {'7', '7', 'n'},
            {'0', '5', 'n'},
            {'9', '9', 'v'},
            {'2', '6', 'n'},
            {'0', '9', 'n'},
            {'6', '4', 'n'},
            {'1', '2', 'n'},
            {'0', '5', 'v'},
            {'1', '8', 'v'},
            {'9', '2', 'n'},
            {'0', '1', 'v'},
            {'3', '5', 'v'},
            {'9', '9', 'v'},
            {'9', '1', 'n'},
            {'3', '3', 'v'},
            {'0', '5', 'n'},
            {'2', '5', 'v'},
            {'6', '2', 'v'},
            {'6', '7', 'v'},
            {'8', '7', 'n'},
            {'2', '0', 'n'},
            {'5', '6', 'v'},
            {'5', '9', 'n'},
            {'7', '5', 'n'},
            {'8', '3', 'n'},
            {'8', '7', 'v'},
            {'1', '7', 'n'},
            {'6', '6', 'n'},
            {'1', '4', 'n'},
            {'1', '7', 'n'},
            {'8', '0', 'v'},
            {'9', '6', 'n'},
            {'2', '8', 'v'},
            {'0', '8', 'v'},
            {'8', '1', 'v'},
            {'5', '2', 'v'},
            {'6', '9', 'n'},
            {'2', '7', 'v'},
            {'0', '8', 'n'},
            {'2', '0', 'v'},
            {'9', '6', 'n'},
            {'3', '0', 'v'},
            {'5', '3', 'v'},
            {'6', '9', 'n'},
            {'4', '6', 'v'},
            {'0', '7', 'v'},
            {'9', '1', 'v'},
            {'8', '9', 'n'},
            {'7', '4', 'n'},
            {'8', '1', 'n'},
            {'1', '9', 'n'},
            {'2', '1', 'n'},
            {'8', '1', 'v'},
            {'8', '7', 'n'},
            {'8', '0', 'v'},
            {'8', '4', 'v'},
            {'9', '5', 'n'},
            {'5', '2', 'n'},
            {'8', '3', 'v'},
            {'8', '8', 'n'},
            {'5', '2', 'n'},
            {'0', '8', 'v'},
            {'0', '7', 'v'},
            {'9', '8', 'n'},
            {'2', '1', 'n'},
            {'7', '6', 'n'},
            {'4', '3', 'n'},
            {'3', '4', 'n'},
            {'5', '4', 'n'},
            {'9', '9', 'n'},
            {'3', '2', 'n'},
            {'0', '1', 'n'},
            {'6', '5', 'n'},
            {'5', '3', 'n'},
            {'6', '8', 'n'},
            {'6', '2', 'n'},
            {'3', '5', 'n'},
            {'4', '3', 'v'},
            {'1', '2', 'v'},
            {'2', '1', 'v'},
            {'2', '1', 'v'},
            {'7', '4', 'v'},
            {'2', '8', 'n'},
            {'5', '4', 'n'},
            {'4', '5', 'n'},
            {'4', '1', 'n'},
            {'1', '0', 'v'},
            {'8', '4', 'n'},
            {'1', '6', 'n'},
            {'7', '1', 'v'},
            {'7', '6', 'n'},
            {'0', '9', 'v'},
            {'6', '0', 'n'},
        };

        final char[][] B09 = {
            {'l'},
            {'f'},
            {'q'},
            {'d'},
            {'f'},
            {'m'},
            {'m'},
            {'s'},
            {'v'},
            {'w'},
            {'r'},
            {'p'},
            {'m'},
            {'z'},
            {'k'},
            {'e'},
            {'a'},
            {'h'},
            {'j'},
            {'k'},
            {'c'},
            {'f'},
            {'w'},
            {'m'},
            {'a'},
            {'j'},
            {'b'},
            {'k'},
            {'y'},
            {'o'},
            {'w'},
            {'o'},
            {'p'},
            {'v'},
            {'m'},
            {'u'},
            {'s'},
            {'y'},
            {'o'},
            {'t'},
            {'f'},
            {'w'},
            {'k'},
            {'y'},
            {'y'},
            {'z'},
            {'o'},
            {'u'},
            {'f'},
            {'e'},
            {'k'},
            {'k'},
            {'h'},
            {'k'},
            {'k'},
            {'v'},
            {'a'},
            {'k'},
            {'j'},
            {'w'},
            {'t'},
            {'w'},
            {'v'},
            {'w'},
            {'j'},
            {'k'},
            {'o'},
        };

        final char[][] P09 = {
            {'5', '8', 'n'},
            {'3', '2', 'v'},
            {'0', '5', 'v'},
            {'4', '8', 'n'},
            {'0', '8', 'v'},
            {'7', '2', 'n'},
            {'4', '7', 'n'},
            {'3', '8', 'n'},
            {'6', '5', 'v'},
            {'0', '9', 'n'},
            {'5', '1', 'v'},
            {'2', '8', 'v'},
            {'4', '7', 'n'},
            {'1', '0', 'n'},
            {'1', '2', 'n'},
            {'7', '7', 'n'},
            {'1', '4', 'n'},
            {'9', '8', 'n'},
            {'2', '5', 'n'},
            {'8', '3', 'v'},
            {'8', '5', 'n'},
            {'6', '1', 'n'},
            {'1', '8', 'v'},
            {'6', '6', 'n'},
            {'1', '4', 'n'},
            {'4', '9', 'v'},
            {'0', '1', 'v'},
            {'3', '7', 'n'},
            {'1', '9', 'n'},
            {'1', '1', 'v'},
            {'8', '2', 'n'},
            {'3', '5', 'n'},
            {'0', '2', 'v'},
            {'3', '6', 'n'},
            {'7', '2', 'v'},
            {'2', '1', 'n'},
            {'6', '3', 'n'},
            {'3', '3', 'v'},
            {'9', '1', 'v'},
            {'5', '5', 'v'},
            {'3', '2', 'n'},
            {'1', '8', 'v'},
            {'7', '4', 'v'},
            {'3', '3', 'n'},
            {'3', '3', 'v'},
            {'3', '0', 'n'},
            {'1', '7', 'n'},
            {'2', '1', 'n'},
            {'6', '1', 'v'},
            {'9', '5', 'v'},
            {'1', '2', 'n'},
            {'7', '4', 'v'},
            {'6', '2', 'v'},
            {'1', '2', 'v'},
            {'7', '4', 'v'},
            {'6', '7', 'v'},
            {'8', '0', 'v'},
            {'1', '2', 'n'},
            {'4', '0', 'n'},
            {'0', '9', 'n'},
            {'5', '4', 'v'},
            {'6', '8', 'n'},
            {'2', '0', 'v'},
            {'4', '5', 'n'},
            {'7', '3', 'v'},
            {'1', '2', 'n'},
            {'3', '5', 'v'},
        };

        final char[][] B10 = {
            {'x'},
            {'o'},
            {'w'},
            {'x'},
            {'m'},
            {'z'},
            {'y'},
            {'p'},
            {'o'},
            {'w'},
            {'z'},
            {'c'},
            {'l'},
            {'n'},
            {'i'},
            {'k'},
            {'k'},
            {'b'},
            {'o'},
            {'q'},
            {'c'},
            {'c'},
            {'k'},
            {'k'},
            {'t'},
            {'k'},
            {'i'},
            {'c'},
            {'d'},
            {'r'},
            {'q'},
            {'g'},
            {'o'},
            {'c'},
            {'m'},
            {'n'},
            {'y'},
            {'r'},
            {'o'},
            {'n'},
            {'k'},
            {'w'},
            {'k'},
            {'b'},
            {'q'},
            {'l'},
        };

        final char[][] P10 = {
            {'6', '7', 'v'},
            {'6', '3', 'v'},
            {'9', '2', 'n'},
            {'9', '4', 'v'},
            {'4', '4', 'v'},
            {'4', '6', 'v'},
            {'2', '0', 'n'},
            {'7', '5', 'n'},
            {'3', '2', 'n'},
            {'9', '2', 'n'},
            {'6', '1', 'n'},
            {'0', '4', 'n'},
            {'8', '9', 'v'},
            {'9', '7', 'v'},
            {'6', '4', 'n'},
            {'3', '3', 'n'},
            {'5', '2', 'v'},
            {'8', '7', 'n'},
            {'6', '3', 'v'},
            {'9', '0', 'v'},
            {'0', '0', 'n'},
            {'3', '6', 'v'},
            {'5', '5', 'n'},
            {'5', '8', 'v'},
            {'5', '6', 'n'},
            {'2', '6', 'n'},
            {'6', '4', 'v'},
            {'6', '8', 'n'},
            {'8', '3', 'v'},
            {'3', '7', 'v'},
            {'5', '4', 'v'},
            {'7', '0', 'n'},
            {'2', '3', 'v'},
            {'3', '6', 'n'},
            {'7', '8', 'v'},
            {'4', '8', 'v'},
            {'2', '4', 'v'},
            {'7', '7', 'n'},
            {'4', '0', 'n'},
            {'9', '6', 'v'},
            {'3', '3', 'n'},
            {'8', '1', 'v'},
            {'8', '2', 'n'},
            {'2', '9', 'v'},
            {'5', '4', 'v'},
            {'9', '9', 'v'},
        };

        System.out.println(Druga.krizankaOK(B01, P01));
        System.out.println(Druga.krizankaOK(B02, P02));
        System.out.println(Druga.krizankaOK(B03, P03));
        System.out.println(Druga.krizankaOK(B04, P04));
        System.out.println(Druga.krizankaOK(B05, P05));
        System.out.println(Druga.krizankaOK(B06, P06));
        System.out.println(Druga.krizankaOK(B07, P07));
        System.out.println(Druga.krizankaOK(B08, P08));
        System.out.println(Druga.krizankaOK(B09, P09));
        System.out.println(Druga.krizankaOK(B10, P10));
    }
}
