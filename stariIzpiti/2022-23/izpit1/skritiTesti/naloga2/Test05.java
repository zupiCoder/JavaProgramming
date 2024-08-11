
import java.util.*;

public class Test05 {

    public static void main(String[] args) {
        final char[][] B01 = {
            {'b'},
            {'s'},
            {'h'},
            {'k'},
            {'l'},
            {'b'},
            {'k'},
            {'a'},
            {'k'},
            {'y'},
            {'x'},
            {'v'},
            {'b'},
            {'k'},
            {'p'},
            {'g'},
            {'b'},
            {'l'},
            {'c'},
            {'v'},
            {'i'},
            {'y'},
            {'h'},
            {'q'},
            {'y'},
            {'r'},
            {'h'},
            {'b'},
            {'a'},
            {'u'},
            {'q'},
            {'l'},
            {'h'},
            {'h'},
            {'o'},
            {'q'},
            {'q'},
            {'e'},
            {'s'},
        };

        final char[][] P01 = {
            {'4', '0', 'n'},
            {'9', '6', 'v'},
            {'3', '5', 'n'},
            {'4', '7', 'n'},
            {'6', '2', 'n'},
            {'5', '5', 'n'},
            {'4', '5', 'n'},
            {'1', '8', 'n'},
            {'2', '7', 'v'},
            {'1', '9', 'v'},
            {'7', '0', 'v'},
            {'1', '0', 'v'},
            {'0', '2', 'n'},
            {'4', '8', 'n'},
            {'6', '1', 'v'},
            {'8', '8', 'v'},
            {'4', '0', 'v'},
            {'4', '2', 'v'},
            {'9', '1', 'v'},
            {'7', '1', 'n'},
            {'3', '6', 'n'},
            {'3', '3', 'n'},
            {'3', '5', 'n'},
            {'8', '3', 'v'},
            {'2', '8', 'v'},
            {'6', '3', 'n'},
            {'3', '7', 'n'},
            {'0', '2', 'v'},
            {'9', '4', 'v'},
            {'7', '9', 'n'},
            {'3', '8', 'v'},
            {'6', '0', 'v'},
            {'8', '4', 'n'},
            {'8', '4', 'n'},
            {'2', '4', 'n'},
            {'0', '9', 'n'},
            {'8', '3', 'v'},
            {'5', '9', 'v'},
            {'8', '1', 'n'},
        };

        final char[][] B02 = {
            {'g'},
            {'q'},
            {'g'},
            {'f'},
            {'v'},
            {'n'},
            {'b'},
            {'p'},
            {'s'},
            {'o'},
            {'m'},
            {'h'},
            {'w'},
            {'m'},
            {'q'},
            {'r'},
            {'g'},
            {'m'},
            {'q'},
            {'g'},
            {'r'},
            {'h'},
            {'b'},
            {'f'},
            {'q'},
            {'r'},
            {'n'},
            {'q'},
            {'f'},
            {'t'},
            {'m'},
            {'t'},
            {'v'},
            {'u'},
            {'v'},
            {'n'},
            {'q'},
            {'l'},
            {'h'},
            {'f'},
            {'q'},
            {'n'},
            {'d'},
            {'w'},
            {'q'},
            {'i'},
            {'t'},
            {'h'},
            {'a'},
            {'o'},
            {'t'},
            {'x'},
            {'v'},
            {'u'},
        };

        final char[][] P02 = {
            {'4', '1', 'n'},
            {'8', '0', 'v'},
            {'7', '0', 'n'},
            {'2', '6', 'n'},
            {'5', '2', 'v'},
            {'8', '8', 'n'},
            {'3', '9', 'v'},
            {'8', '7', 'n'},
            {'2', '7', 'n'},
            {'9', '8', 'v'},
            {'4', '0', 'n'},
            {'5', '3', 'n'},
            {'0', '3', 'v'},
            {'3', '8', 'n'},
            {'8', '0', 'n'},
            {'6', '1', 'n'},
            {'3', '2', 'v'},
            {'6', '0', 'v'},
            {'6', '5', 'n'},
            {'7', '3', 'v'},
            {'6', '1', 'n'},
            {'2', '3', 'v'},
            {'3', '9', 'v'},
            {'9', '6', 'v'},
            {'4', '8', 'n'},
            {'8', '3', 'v'},
            {'8', '8', 'v'},
            {'4', '8', 'v'},
            {'2', '6', 'v'},
            {'0', '4', 'n'},
            {'3', '4', 'n'},
            {'8', '5', 'n'},
            {'0', '9', 'v'},
            {'1', '4', 'v'},
            {'7', '7', 'v'},
            {'1', '1', 'n'},
            {'1', '7', 'n'},
            {'7', '5', 'n'},
            {'6', '6', 'n'},
            {'2', '6', 'v'},
            {'4', '8', 'v'},
            {'1', '9', 'n'},
            {'3', '3', 'n'},
            {'0', '3', 'n'},
            {'6', '5', 'v'},
            {'5', '5', 'n'},
            {'8', '5', 'v'},
            {'2', '3', 'n'},
            {'3', '0', 'n'},
            {'0', '0', 'n'},
            {'8', '5', 'v'},
            {'3', '6', 'n'},
            {'5', '2', 'n'},
            {'1', '4', 'n'},
        };

        final char[][] B03 = {
            {'c'},
            {'k'},
            {'m'},
            {'l'},
            {'r'},
            {'k'},
            {'d'},
            {'y'},
            {'c'},
            {'a'},
            {'p'},
            {'h'},
            {'x'},
            {'z'},
            {'f'},
            {'c'},
            {'f'},
            {'w'},
            {'k'},
            {'f'},
            {'b'},
            {'l'},
            {'x'},
            {'t'},
            {'c'},
            {'f'},
            {'f'},
            {'f'},
            {'q'},
            {'c'},
            {'g'},
            {'w'},
            {'h'},
            {'v'},
            {'y'},
            {'h'},
            {'t'},
            {'c'},
            {'e'},
            {'w'},
            {'q'},
            {'p'},
            {'k'},
        };

        final char[][] P03 = {
            {'0', '5', 'v'},
            {'8', '9', 'v'},
            {'6', '5', 'n'},
            {'7', '6', 'v'},
            {'7', '0', 'v'},
            {'7', '9', 'v'},
            {'3', '7', 'v'},
            {'6', '0', 'v'},
            {'9', '0', 'v'},
            {'6', '4', 'n'},
            {'9', '5', 'v'},
            {'3', '9', 'n'},
            {'0', '0', 'v'},
            {'6', '2', 'n'},
            {'1', '5', 'n'},
            {'9', '0', 'v'},
            {'1', '5', 'n'},
            {'1', '6', 'v'},
            {'2', '6', 'v'},
            {'1', '5', 'n'},
            {'3', '8', 'n'},
            {'1', '8', 'n'},
            {'6', '8', 'n'},
            {'1', '3', 'n'},
            {'3', '2', 'n'},
            {'1', '5', 'n'},
            {'7', '3', 'v'},
            {'7', '3', 'n'},
            {'9', '2', 'n'},
            {'9', '0', 'v'},
            {'1', '7', 'n'},
            {'1', '6', 'n'},
            {'4', '0', 'v'},
            {'5', '7', 'v'},
            {'8', '5', 'v'},
            {'1', '4', 'n'},
            {'1', '6', 'v'},
            {'5', '3', 'n'},
            {'5', '4', 'v'},
            {'9', '9', 'n'},
            {'8', '3', 'n'},
            {'2', '7', 'v'},
            {'8', '8', 'n'},
        };

        final char[][] B04 = {
            {'c'},
            {'k'},
            {'u'},
            {'t'},
            {'t'},
            {'u'},
            {'b'},
            {'d'},
            {'q'},
            {'c'},
            {'i'},
            {'j'},
            {'z'},
            {'b'},
            {'f'},
            {'g'},
            {'x'},
            {'b'},
            {'s'},
            {'k'},
            {'x'},
            {'v'},
            {'d'},
            {'v'},
            {'h'},
            {'n'},
            {'j'},
            {'u'},
            {'q'},
            {'k'},
            {'b'},
            {'d'},
            {'i'},
            {'c'},
            {'a'},
            {'o'},
            {'d'},
            {'j'},
            {'t'},
            {'p'},
            {'e'},
            {'p'},
            {'u'},
            {'r'},
            {'f'},
            {'j'},
            {'i'},
            {'j'},
            {'v'},
            {'u'},
            {'t'},
            {'j'},
            {'p'},
            {'h'},
            {'i'},
            {'k'},
            {'k'},
            {'e'},
            {'c'},
            {'c'},
            {'d'},
            {'m'},
            {'v'},
            {'n'},
            {'g'},
            {'u'},
        };

        final char[][] P04 = {
            {'0', '2', 'n'},
            {'6', '6', 'n'},
            {'2', '2', 'v'},
            {'7', '5', 'n'},
            {'5', '0', 'n'},
            {'6', '5', 'v'},
            {'5', '4', 'v'},
            {'4', '0', 'n'},
            {'8', '6', 'v'},
            {'4', '1', 'v'},
            {'1', '4', 'v'},
            {'0', '7', 'n'},
            {'7', '6', 'n'},
            {'5', '9', 'n'},
            {'7', '3', 'n'},
            {'7', '9', 'v'},
            {'4', '8', 'n'},
            {'5', '9', 'v'},
            {'1', '3', 'n'},
            {'6', '6', 'n'},
            {'9', '4', 'v'},
            {'1', '7', 'n'},
            {'4', '9', 'v'},
            {'0', '5', 'v'},
            {'0', '0', 'v'},
            {'7', '2', 'v'},
            {'1', '6', 'v'},
            {'6', '5', 'n'},
            {'5', '3', 'n'},
            {'8', '7', 'v'},
            {'7', '8', 'v'},
            {'8', '2', 'v'},
            {'9', '0', 'v'},
            {'4', '1', 'v'},
            {'3', '8', 'v'},
            {'4', '3', 'n'},
            {'4', '9', 'n'},
            {'0', '7', 'v'},
            {'7', '5', 'v'},
            {'2', '7', 'v'},
            {'4', '2', 'n'},
            {'2', '7', 'v'},
            {'7', '4', 'n'},
            {'7', '1', 'v'},
            {'4', '4', 'v'},
            {'1', '6', 'n'},
            {'6', '0', 'n'},
            {'1', '6', 'v'},
            {'6', '8', 'n'},
            {'6', '5', 'v'},
            {'9', '5', 'n'},
            {'9', '6', 'v'},
            {'8', '2', 'n'},
            {'0', '3', 'n'},
            {'6', '0', 'n'},
            {'9', '2', 'v'},
            {'3', '7', 'n'},
            {'6', '2', 'v'},
            {'0', '2', 'n'},
            {'4', '1', 'n'},
            {'4', '0', 'v'},
            {'9', '3', 'n'},
            {'6', '8', 'v'},
            {'8', '3', 'n'},
            {'5', '5', 'v'},
            {'0', '1', 'n'},
        };

        final char[][] B05 = {
            {'l'},
            {'l'},
            {'r'},
            {'l'},
            {'e'},
            {'o'},
            {'r'},
            {'r'},
            {'r'},
            {'k'},
            {'v'},
            {'v'},
            {'t'},
            {'m'},
            {'d'},
            {'s'},
            {'d'},
            {'x'},
            {'x'},
            {'n'},
            {'k'},
            {'e'},
            {'x'},
            {'x'},
            {'n'},
            {'x'},
            {'z'},
            {'e'},
            {'k'},
            {'t'},
            {'a'},
            {'l'},
            {'e'},
            {'b'},
            {'s'},
            {'b'},
            {'s'},
            {'i'},
            {'u'},
            {'r'},
            {'e'},
            {'v'},
            {'z'},
            {'m'},
            {'r'},
            {'y'},
            {'k'},
            {'e'},
            {'o'},
            {'r'},
            {'e'},
            {'m'},
            {'h'},
            {'o'},
            {'e'},
            {'u'},
            {'j'},
            {'b'},
        };

        final char[][] P05 = {
            {'9', '4', 'n'},
            {'3', '2', 'v'},
            {'6', '3', 'n'},
            {'0', '9', 'v'},
            {'5', '1', 'n'},
            {'5', '8', 'n'},
            {'2', '8', 'n'},
            {'2', '5', 'n'},
            {'4', '7', 'v'},
            {'9', '3', 'n'},
            {'0', '6', 'n'},
            {'0', '6', 'v'},
            {'6', '1', 'v'},
            {'3', '8', 'v'},
            {'8', '8', 'n'},
            {'6', '5', 'n'},
            {'8', '8', 'n'},
            {'4', '2', 'v'},
            {'1', '9', 'v'},
            {'3', '5', 'n'},
            {'7', '8', 'n'},
            {'3', '6', 'v'},
            {'4', '2', 'v'},
            {'7', '7', 'v'},
            {'6', '4', 'n'},
            {'7', '7', 'n'},
            {'0', '0', 'n'},
            {'6', '9', 'v'},
            {'5', '6', 'n'},
            {'6', '1', 'v'},
            {'7', '5', 'n'},
            {'6', '2', 'v'},
            {'7', '2', 'v'},
            {'9', '2', 'n'},
            {'8', '7', 'v'},
            {'2', '1', 'n'},
            {'8', '7', 'v'},
            {'4', '8', 'v'},
            {'9', '8', 'n'},
            {'8', '5', 'n'},
            {'1', '2', 'n'},
            {'0', '6', 'n'},
            {'2', '2', 'n'},
            {'3', '8', 'v'},
            {'1', '1', 'n'},
            {'5', '3', 'n'},
            {'6', '2', 'v'},
            {'5', '1', 'n'},
            {'2', '9', 'n'},
            {'1', '1', 'n'},
            {'1', '2', 'v'},
            {'5', '5', 'v'},
            {'7', '1', 'n'},
            {'9', '7', 'v'},
            {'5', '1', 'v'},
            {'9', '8', 'n'},
            {'6', '6', 'n'},
            {'9', '6', 'n'},
        };

        final char[][] B06 = {
            {'h'},
            {'f'},
            {'o'},
            {'h'},
            {'n'},
            {'z'},
            {'v'},
            {'i'},
            {'o'},
            {'z'},
            {'f'},
            {'t'},
            {'f'},
            {'y'},
            {'m'},
            {'e'},
            {'m'},
            {'a'},
            {'o'},
            {'v'},
            {'v'},
            {'a'},
            {'d'},
            {'t'},
            {'q'},
            {'w'},
            {'w'},
            {'n'},
            {'q'},
            {'q'},
            {'z'},
            {'f'},
            {'w'},
            {'v'},
            {'b'},
            {'s'},
            {'s'},
            {'b'},
            {'d'},
            {'u'},
            {'v'},
            {'a'},
            {'v'},
            {'l'},
            {'a'},
            {'q'},
            {'u'},
            {'o'},
            {'a'},
            {'x'},
            {'a'},
            {'e'},
            {'z'},
            {'n'},
            {'q'},
            {'o'},
            {'f'},
            {'o'},
            {'f'},
            {'j'},
            {'u'},
            {'n'},
            {'i'},
            {'v'},
            {'n'},
            {'u'},
            {'n'},
            {'v'},
            {'m'},
            {'b'},
            {'d'},
            {'m'},
            {'d'},
            {'n'},
            {'m'},
            {'g'},
            {'h'},
            {'u'},
            {'q'},
            {'u'},
            {'d'},
            {'k'},
            {'y'},
            {'t'},
            {'k'},
            {'d'},
            {'v'},
            {'h'},
            {'y'},
            {'a'},
            {'d'},
            {'u'},
            {'v'},
            {'u'},
        };

        final char[][] P06 = {
            {'5', '3', 'v'},
            {'2', '4', 'v'},
            {'4', '2', 'v'},
            {'8', '0', 'v'},
            {'5', '2', 'n'},
            {'5', '8', 'n'},
            {'9', '0', 'v'},
            {'7', '9', 'v'},
            {'2', '9', 'n'},
            {'5', '4', 'v'},
            {'6', '7', 'n'},
            {'1', '4', 'v'},
            {'2', '4', 'n'},
            {'2', '2', 'v'},
            {'3', '4', 'n'},
            {'0', '2', 'v'},
            {'8', '5', 'n'},
            {'0', '9', 'n'},
            {'4', '2', 'n'},
            {'7', '0', 'n'},
            {'9', '0', 'v'},
            {'0', '9', 'v'},
            {'6', '5', 'n'},
            {'0', '6', 'v'},
            {'6', '3', 'v'},
            {'7', '7', 'n'},
            {'4', '4', 'n'},
            {'5', '2', 'v'},
            {'1', '6', 'n'},
            {'6', '3', 'n'},
            {'6', '1', 'n'},
            {'3', '6', 'n'},
            {'4', '4', 'n'},
            {'5', '6', 'v'},
            {'4', '1', 'v'},
            {'0', '4', 'n'},
            {'4', '5', 'v'},
            {'3', '8', 'v'},
            {'2', '6', 'v'},
            {'9', '4', 'v'},
            {'0', '3', 'n'},
            {'8', '3', 'n'},
            {'5', '6', 'n'},
            {'7', '1', 'v'},
            {'0', '9', 'n'},
            {'4', '6', 'n'},
            {'4', '8', 'v'},
            {'4', '2', 'n'},
            {'5', '9', 'n'},
            {'6', '2', 'n'},
            {'5', '9', 'n'},
            {'0', '2', 'n'},
            {'4', '7', 'v'},
            {'2', '3', 'n'},
            {'4', '3', 'n'},
            {'2', '9', 'n'},
            {'2', '7', 'v'},
            {'4', '2', 'v'},
            {'3', '6', 'v'},
            {'1', '7', 'n'},
            {'3', '1', 'v'},
            {'2', '3', 'v'},
            {'7', '9', 'v'},
            {'0', '7', 'v'},
            {'6', '8', 'v'},
            {'3', '0', 'n'},
            {'1', '9', 'v'},
            {'7', '5', 'v'},
            {'9', '6', 'n'},
            {'1', '1', 'n'},
            {'2', '6', 'n'},
            {'3', '4', 'n'},
            {'2', '0', 'v'},
            {'4', '9', 'v'},
            {'3', '4', 'v'},
            {'0', '8', 'v'},
            {'9', '7', 'n'},
            {'4', '8', 'v'},
            {'4', '6', 'n'},
            {'3', '2', 'v'},
            {'7', '6', 'v'},
            {'0', '1', 'v'},
            {'8', '2', 'n'},
            {'0', '6', 'v'},
            {'2', '1', 'n'},
            {'2', '0', 'n'},
            {'7', '0', 'v'},
            {'9', '7', 'n'},
            {'2', '2', 'n'},
            {'0', '9', 'v'},
            {'7', '6', 'n'},
            {'3', '0', 'n'},
            {'9', '0', 'v'},
            {'3', '0', 'n'},
        };

        final char[][] B07 = {
            {'z'},
            {'v'},
            {'m'},
            {'o'},
            {'m'},
            {'y'},
            {'m'},
            {'z'},
            {'m'},
            {'r'},
            {'o'},
            {'o'},
            {'r'},
            {'i'},
            {'k'},
            {'h'},
            {'e'},
            {'s'},
            {'o'},
            {'k'},
            {'z'},
            {'m'},
            {'v'},
            {'a'},
            {'d'},
            {'w'},
            {'y'},
            {'h'},
            {'n'},
            {'b'},
            {'o'},
            {'i'},
            {'o'},
            {'h'},
            {'h'},
            {'m'},
            {'r'},
            {'h'},
            {'o'},
            {'i'},
            {'j'},
            {'b'},
            {'f'},
            {'w'},
        };

        final char[][] P07 = {
            {'5', '0', 'v'},
            {'3', '5', 'v'},
            {'8', '8', 'v'},
            {'3', '0', 'n'},
            {'9', '7', 'n'},
            {'0', '2', 'n'},
            {'9', '7', 'n'},
            {'5', '0', 'n'},
            {'9', '7', 'v'},
            {'6', '7', 'v'},
            {'2', '3', 'n'},
            {'9', '6', 'v'},
            {'4', '7', 'v'},
            {'5', '8', 'v'},
            {'1', '4', 'n'},
            {'7', '7', 'n'},
            {'8', '9', 'n'},
            {'0', '3', 'n'},
            {'7', '0', 'v'},
            {'8', '2', 'n'},
            {'5', '0', 'n'},
            {'6', '3', 'v'},
            {'3', '5', 'v'},
            {'9', '2', 'n'},
            {'5', '7', 'v'},
            {'3', '3', 'n'},
            {'8', '4', 'v'},
            {'9', '9', 'n'},
            {'1', '9', 'v'},
            {'3', '4', 'n'},
            {'1', '0', 'v'},
            {'8', '6', 'n'},
            {'2', '3', 'n'},
            {'9', '1', 'n'},
            {'3', '2', 'v'},
            {'3', '8', 'n'},
            {'4', '7', 'n'},
            {'9', '9', 'v'},
            {'7', '0', 'n'},
            {'1', '7', 'v'},
            {'6', '2', 'v'},
            {'9', '0', 'v'},
            {'8', '1', 'v'},
            {'0', '8', 'v'},
        };

        final char[][] B08 = {
            {'w'},
            {'f'},
            {'z'},
            {'m'},
            {'e'},
            {'f'},
            {'n'},
            {'c'},
            {'m'},
            {'w'},
            {'e'},
            {'v'},
            {'w'},
            {'n'},
            {'b'},
            {'e'},
            {'p'},
            {'h'},
            {'m'},
            {'z'},
            {'z'},
            {'z'},
            {'w'},
            {'q'},
            {'j'},
            {'k'},
            {'g'},
            {'n'},
            {'z'},
            {'w'},
            {'x'},
            {'w'},
            {'z'},
            {'k'},
            {'k'},
            {'g'},
            {'e'},
            {'o'},
            {'c'},
            {'q'},
            {'h'},
            {'f'},
            {'c'},
            {'c'},
            {'h'},
            {'h'},
            {'w'},
            {'w'},
            {'g'},
            {'b'},
            {'t'},
            {'o'},
            {'y'},
            {'a'},
            {'c'},
            {'c'},
            {'y'},
            {'c'},
            {'d'},
            {'t'},
            {'x'},
            {'s'},
            {'h'},
            {'k'},
            {'i'},
            {'i'},
            {'h'},
            {'e'},
            {'s'},
            {'c'},
            {'u'},
            {'y'},
            {'q'},
        };

        final char[][] P08 = {
            {'0', '8', 'v'},
            {'4', '3', 'v'},
            {'1', '9', 'v'},
            {'2', '0', 'v'},
            {'9', '7', 'n'},
            {'8', '7', 'n'},
            {'6', '3', 'n'},
            {'5', '3', 'v'},
            {'9', '8', 'n'},
            {'0', '8', 'n'},
            {'9', '7', 'n'},
            {'7', '9', 'v'},
            {'0', '8', 'n'},
            {'1', '3', 'n'},
            {'3', '3', 'v'},
            {'4', '9', 'v'},
            {'5', '5', 'v'},
            {'6', '9', 'n'},
            {'9', '4', 'v'},
            {'2', '9', 'n'},
            {'9', '3', 'v'},
            {'9', '3', 'v'},
            {'6', '0', 'v'},
            {'3', '9', 'v'},
            {'0', '4', 'n'},
            {'5', '8', 'v'},
            {'0', '5', 'n'},
            {'4', '2', 'n'},
            {'2', '9', 'n'},
            {'0', '8', 'v'},
            {'3', '6', 'v'},
            {'0', '1', 'n'},
            {'9', '3', 'v'},
            {'5', '7', 'v'},
            {'4', '5', 'v'},
            {'3', '1', 'n'},
            {'9', '7', 'n'},
            {'4', '7', 'n'},
            {'1', '0', 'v'},
            {'8', '4', 'n'},
            {'1', '4', 'n'},
            {'8', '5', 'v'},
            {'1', '0', 'v'},
            {'0', '7', 'v'},
            {'0', '9', 'n'},
            {'6', '2', 'v'},
            {'0', '1', 'n'},
            {'6', '0', 'n'},
            {'3', '1', 'n'},
            {'7', '3', 'n'},
            {'5', '1', 'v'},
            {'2', '6', 'v'},
            {'4', '8', 'n'},
            {'7', '3', 'v'},
            {'0', '6', 'v'},
            {'5', '3', 'v'},
            {'4', '8', 'n'},
            {'3', '7', 'v'},
            {'7', '1', 'v'},
            {'3', '2', 'n'},
            {'3', '6', 'n'},
            {'1', '6', 'n'},
            {'6', '2', 'v'},
            {'4', '5', 'n'},
            {'3', '4', 'v'},
            {'8', '3', 'v'},
            {'6', '9', 'n'},
            {'4', '9', 'n'},
            {'2', '1', 'v'},
            {'0', '6', 'n'},
            {'4', '0', 'n'},
            {'2', '8', 'n'},
            {'8', '4', 'v'},
        };

        final char[][] B09 = {
            {'i'},
            {'o'},
            {'t'},
            {'o'},
            {'x'},
            {'o'},
            {'t'},
            {'q'},
            {'n'},
            {'n'},
            {'h'},
            {'g'},
            {'r'},
            {'r'},
            {'x'},
            {'v'},
            {'w'},
            {'q'},
            {'o'},
            {'v'},
            {'i'},
            {'a'},
            {'q'},
            {'o'},
            {'l'},
            {'a'},
            {'r'},
            {'t'},
            {'n'},
            {'k'},
            {'k'},
            {'v'},
            {'u'},
            {'d'},
            {'j'},
            {'x'},
            {'o'},
            {'h'},
            {'n'},
            {'j'},
            {'f'},
            {'m'},
            {'v'},
            {'x'},
            {'y'},
            {'p'},
            {'y'},
            {'g'},
            {'v'},
            {'o'},
            {'m'},
        };

        final char[][] P09 = {
            {'8', '3', 'n'},
            {'8', '8', 'v'},
            {'8', '4', 'n'},
            {'8', '8', 'v'},
            {'7', '5', 'v'},
            {'7', '0', 'v'},
            {'2', '7', 'n'},
            {'0', '8', 'n'},
            {'6', '2', 'v'},
            {'0', '7', 'n'},
            {'5', '6', 'v'},
            {'1', '3', 'n'},
            {'9', '9', 'v'},
            {'2', '5', 'v'},
            {'9', '3', 'n'},
            {'8', '6', 'v'},
            {'3', '4', 'v'},
            {'0', '2', 'v'},
            {'6', '5', 'v'},
            {'4', '5', 'n'},
            {'6', '1', 'v'},
            {'1', '6', 'v'},
            {'0', '8', 'v'},
            {'6', '5', 'n'},
            {'5', '7', 'n'},
            {'1', '6', 'v'},
            {'9', '9', 'n'},
            {'9', '8', 'v'},
            {'0', '7', 'v'},
            {'5', '5', 'n'},
            {'5', '5', 'v'},
            {'8', '0', 'v'},
            {'1', '5', 'v'},
            {'0', '4', 'n'},
            {'4', '0', 'v'},
            {'7', '5', 'n'},
            {'6', '5', 'v'},
            {'5', '6', 'n'},
            {'2', '0', 'n'},
            {'4', '0', 'v'},
            {'4', '7', 'n'},
            {'5', '8', 'v'},
            {'8', '0', 'n'},
            {'7', '5', 'v'},
            {'7', '2', 'n'},
            {'9', '1', 'v'},
            {'5', '3', 'v'},
            {'2', '8', 'v'},
            {'8', '6', 'v'},
            {'7', '6', 'v'},
            {'3', '9', 'n'},
        };

        final char[][] B10 = {
            {'u'},
            {'o'},
            {'o'},
            {'z'},
            {'k'},
            {'v'},
            {'g'},
            {'m'},
            {'h'},
            {'l'},
            {'l'},
            {'b'},
            {'k'},
            {'t'},
            {'z'},
            {'h'},
            {'u'},
            {'u'},
            {'j'},
            {'b'},
            {'j'},
            {'g'},
            {'s'},
        };

        final char[][] P10 = {
            {'1', '0', 'v'},
            {'4', '7', 'v'},
            {'8', '4', 'n'},
            {'8', '6', 'n'},
            {'1', '2', 'n'},
            {'2', '7', 'n'},
            {'7', '4', 'v'},
            {'4', '0', 'n'},
            {'5', '4', 'v'},
            {'4', '2', 'v'},
            {'1', '6', 'n'},
            {'6', '5', 'n'},
            {'9', '9', 'n'},
            {'3', '7', 'n'},
            {'8', '6', 'v'},
            {'9', '6', 'v'},
            {'9', '3', 'v'},
            {'9', '2', 'v'},
            {'3', '6', 'v'},
            {'6', '5', 'v'},
            {'7', '9', 'n'},
            {'0', '7', 'n'},
            {'5', '8', 'v'},
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
