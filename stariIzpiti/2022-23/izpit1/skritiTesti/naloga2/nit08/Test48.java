
import java.util.*;

public class Test48 {

    public static void main(String[] args) {
        final char[][] B01 = {
            {'v', 'u', 'v', 'u', 'd', 'o', 'g'},
            {'r', 'f', 's', 'r', 'w', 'q', 'g'},
            {'y', 'h', 'f', 't', 'c', 'o', 's', 'g'},
            {'c', 'l', 'p'},
            {'g', 'f'},
            {'w', 'w'},
            {'h', 'j', 'g', 'f'},
            {'z', 'd'},
            {'j', 'g'},
            {'v', 'l', 'j', 'h'},
            {'m', 'q', 'p'},
            {'g', 'o', 'd', 'e'},
            {'t', 'm', 'b', 'h', 'h'},
            {'u', 'p', 'n', 'j', 'l', 'e', 't'},
            {'q', 'z', 'u', 'm', 'i', 'x', 'v', 'e'},
            {'q', 'z', 'u', 'm', 'i'},
            {'l', 'j', 'h', 'j'},
            {'m', 'r', 'h', 'h'},
            {'f', 'v', 'u', 'v'},
            {'h', 'j', 'g', 'f', 'q', 'r'},
            {'f', 'f', 'u', 'c', 'l', 'p', 'r', 'f', 'u'},
            {'k', 'u', 'v', 'y'},
            {'v', 'g', 'u', 'c', 'u'},
            {'g', 'v', 'l', 'a', 'm', 'j', 'q', 'b', 'p'},
            {'g', 'a', 'n', 'i', 'i'},
            {'y', 'b', 'o', 'f'},
            {'m', 'v', 'g', 'n', 's'},
            {'v', 'l', 'a', 'm', 'j', 'q', 'b', 'p'},
            {'g', 'f', 'v', 'u', 'v', 'u', 'd'},
            {'b', 'k', 'p', 'x'},
            {'u', 'y', 'a', 'n', 'x'},
            {'j', 'h', 'j'},
            {'u', 'v', 'u'},
            {'u', 'y', 'a', 'n', 'x', 's', 'z', 'g'},
            {'f', 'a'},
            {'s', 'v', 'i', 'v', 'g'},
            {'j', 'o', 'k', 'g', 'g', 't', 'm', 'b'},
            {'f', 'a', 'z', 'x', 'f', 'h', 'k'},
            {'p', 'x'},
            {'i', 'v', 'g', 'u', 'c'},
            {'r', 's', 'v', 'i', 'v', 'g'},
            {'z', 'j', 'c', 'm', 'd'},
            {'z', 'd', 'w', 'n', 'm'},
            {'f', 'u', 'c', 'l', 'p'},
            {'y', 'v', 'k', 'f'},
            {'r', 'w', 'w', 'k', 'u', 'v', 'y', 'b'},
            {'j', 'n'},
            {'c', 'l', 'p', 'r'},
            {'f', 'f', 'u', 'c', 'l'},
            {'r', 'h', 'h', 'g', 'u'},
            {'p', 'g', 'o', 'd', 'e', 'o'},
            {'j', 'o'},
            {'r', 'z'},
            {'o', 'f'},
            {'k', 'x', 'n', 'o', 'v', 'k', 'k', 'v', 'u'},
            {'v', 'l', 'a', 'm'},
            {'k', 'x', 'n', 'o', 'v', 'k', 'k', 'v'},
            {'v', 'r', 'z', 'd', 'w', 'n'},
            {'b', 'x', 'x', 'n', 'm', 'y'},
            {'p', 'j', 'v', 'r', 't', 'l', 'z', 's', 'b'},
            {'o', 'd', 'e', 'o', 'f', 'f'},
            {'r', 's', 'v', 'i', 'v', 'g', 'u', 'c'},
            {'u', 'y', 'a', 'n', 'x', 's', 'z'},
            {'b', 'h', 'h', 'd', 'k', 'o', 'v', 's', 'z'},
            {'s', 'm', 'q', 'p', 'a', 't', 'u', 'p'},
            {'f', 'u', 'f', 'p', 'x', 't', 'g', 'z', 'd'},
            {'v', 'u'},
            {'h', 'e', 'k', 'v', 's', 'a', 'c', 'y'},
            {'c', 'y', 'h', 's'},
            {'u', 'c', 'l', 'p', 'r', 'f', 'u', 'f', 'p'},
        };

        final char[][] P01 = {
            {'3', '8', 'n'},
            {'4', '2', 'n'},
            {'5', '0', 'v'},
            {'4', '9', 'n'},
            {'1', '8', 'n'},
            {'8', '1', 'v'},
            {'1', '6', 'v'},
            {'9', '0', 'v'},
            {'1', '7', 'v'},
            {'1', '3', 'v'},
            {'6', '3', 'v'},
            {'2', '3', 'v'},
            {'6', '7', 'n'},
            {'6', '8', 'v'},
            {'6', '4', 'n'},
            {'6', '4', 'n'},
            {'1', '4', 'v'},
            {'9', '4', 'v'},
            {'2', '8', 'n'},
            {'1', '6', 'v'},
            {'1', '9', 'n'},
            {'8', '3', 'v'},
            {'4', '6', 'v'},
            {'5', '7', 'v'},
            {'9', '8', 'n'},
            {'8', '6', 'v'},
            {'0', '3', 'n'},
            {'5', '8', 'v'},
            {'1', '8', 'n'},
            {'0', '2', 'n'},
            {'9', '9', 'v'},
            {'1', '5', 'v'},
            {'4', '8', 'n'},
            {'9', '9', 'v'},
            {'8', '9', 'v'},
            {'4', '3', 'v'},
            {'1', '7', 'n'},
            {'8', '9', 'v'},
            {'2', '2', 'n'},
            {'4', '5', 'v'},
            {'4', '2', 'v'},
            {'7', '4', 'v'},
            {'9', '0', 'n'},
            {'2', '9', 'n'},
            {'1', '1', 'n'},
            {'8', '0', 'v'},
            {'0', '5', 'v'},
            {'4', '9', 'n'},
            {'1', '9', 'n'},
            {'9', '5', 'v'},
            {'2', '2', 'v'},
            {'1', '7', 'n'},
            {'8', '0', 'n'},
            {'2', '7', 'v'},
            {'3', '1', 'v'},
            {'5', '8', 'v'},
            {'3', '1', 'v'},
            {'7', '0', 'n'},
            {'0', '0', 'n'},
            {'6', '5', 'n'},
            {'2', '4', 'v'},
            {'4', '2', 'v'},
            {'9', '9', 'v'},
            {'8', '7', 'n'},
            {'6', '2', 'v'},
            {'8', '9', 'n'},
            {'3', '8', 'n'},
            {'1', '6', 'n'},
            {'7', '6', 'n'},
            {'3', '9', 'n'},
        };

        final char[][] B02 = {
            {'g', 'y', 'k', 'p', 't', 'j', 'p', 'a', 'p'},
            {'b', 'z', 'e', 'h', 'd'},
            {'f', 'i', 'u', 'w', 'l', 's'},
            {'l', 'p', 'v'},
            {'u', 'n', 'e', 'b', 'e', 'x', 'm', 'v'},
            {'y', 'k', 'u', 'v', 'z', 'n', 'n'},
            {'r', 'y', 's', 't', 'd'},
            {'f', 'u', 'r', 'd', 'o', 'l', 'i', 'j', 'v'},
            {'p', 'v', 'e', 'c', 'y'},
            {'x', 'y', 'd', 'k', 'p', 'v', 'e', 'c', 'y'},
            {'y', 's', 't', 'd', 'r', 'v', 'r', 'c', 'w'},
            {'t', 'j', 't', 'k', 'p', 'n', 'u', 'h'},
            {'o', 'n', 'e', 'y', 't', 'j', 't', 'k', 'p'},
            {'y', 'd', 'k', 'p', 'v', 'e', 'c'},
            {'n', 'v', 'c', 'v', 'y', 'u'},
            {'p', 'v', 'z'},
            {'a', 'j', 'l', 'y', 'f', 'i'},
            {'x', 'l', 's', 'k', 'l'},
            {'i', 'g', 'f'},
            {'z', 'f', 'l', 'v', 'k'},
            {'w', 'e', 't', 'n', 'n', 'l', 'z'},
            {'f', 'j', 'y', 'l', 'b'},
            {'y', 'k', 'p', 't', 'j', 'p'},
            {'t', 'l', 'd'},
            {'c', 'v', 'y', 'u', 'n', 'e'},
            {'n', 'n', 'l'},
            {'n', 'v', 'f', 'j', 'b', 'z', 'e', 'h', 'd'},
            {'k', 'l', 'v'},
            {'k', 'u', 'v', 'z', 'n', 'n', 'f', 'o', 'i'},
            {'x', 'l', 's', 'k', 'l', 'u'},
            {'v', 'd', 'c'},
            {'n', 'n', 'f', 'o'},
            {'r', 'w', 'k', 'l', 'v', 'i', 'z', 'v'},
            {'c', 'w', 'o', 'p', 'r'},
            {'k', 'n', 'b', 'z', 'q', 'f', 'v', 'b'},
            {'l', 'u', 'l', 'j'},
            {'n', 'n', 'l', 'z', 'p'},
            {'l', 'v', 'i', 'z', 'v', 'n', 'n', 'b'},
            {'k', 'o', 'n', 'e', 'y', 't', 'j', 't'},
            {'v', 'c', 'v'},
            {'l', 'i', 'j', 'v', 'd', 'i', 'e', 'k'},
            {'z', 'e', 'h'},
            {'q', 'f', 'e'},
            {'y', 'i', 'u'},
            {'l', 'j', 'v', 'y', 'd'},
            {'k', 'p', 't', 'j', 'p', 'a'},
            {'y', 't', 'j', 't'},
            {'l', 'v', 'k', 'n', 'b'},
            {'y', 'w', 'e', 't', 'n', 'n', 'l'},
            {'l', 's', 'u', 't', 'e', 'q', 'i'},
            {'r', 'd', 'o', 'l', 'i', 'j'},
            {'f', 'j', 'b'},
            {'l', 'b', 's', 'u', 'n', 's', 'q', 'a'},
            {'r', 'y', 's', 't'},
            {'l', 'p', 'v', 'z', 'j'},
            {'s', 's', 'g', 'y'},
            {'v', 'i', 'z', 'v', 'n', 'n', 'b', 'd', 'b'},
            {'n', 'n', 'f'},
            {'d', 'g', 'p', 'q', 'i'},
            {'e', 't'},
            {'v', 'd', 'c', 'm', 'k', 'e'},
            {'j', 'y', 'l', 'b'},
            {'t', 'j'},
            {'z', 'n', 'n', 'f', 'o', 'i'},
            {'u', 'w', 'l', 's', 'u', 't'},
            {'l', 's', 'k', 'l'},
            {'y', 'd', 'z', 'o', 'q', 'h'},
            {'l', 'a', 'n', 'v', 'h'},
            {'f', 'v', 'b'},
            {'d', 'n', 'v'},
            {'z', 'v', 'n', 'n'},
            {'z', 'j', 'q', 'f', 'e', 'l'},
            {'n', 'v', 'f', 'j', 'b', 'z', 'e'},
            {'n', 'b', 'd', 'b', 'k', 'n', 'v', 's', 'x'},
            {'e', 's'},
            {'l', 'j'},
            {'a', 'b', 'y', 'w', 'e'},
            {'e', 'b'},
            {'i', 'z', 'v', 'n', 'n'},
            {'r', 'v', 'r', 'c', 'w', 'o'},
            {'f', 'f', 'f', 'n', 'b', 'w'},
            {'w', 'k'},
            {'n', 'v'},
            {'t', 'j', 'p'},
            {'w', 'k', 't', 'x', 'f', 'i', 'l', 'v', 'd'},
            {'u', 'n'},
            {'f', 'j', 'r', 'p', 'e', 's', 'v', 'f'},
            {'l', 'v', 'k', 'n', 'b', 'z', 'q', 'f', 'v'},
            {'s', 'g'},
            {'f', 'e', 'l', 'i', 'e'},
        };

        final char[][] P02 = {
            {'2', '5', 'v'},
            {'8', '9', 'n'},
            {'1', '4', 'v'},
            {'1', '8', 'n'},
            {'8', '6', 'v'},
            {'4', '4', 'v'},
            {'0', '3', 'n'},
            {'5', '1', 'v'},
            {'7', '4', 'n'},
            {'3', '4', 'n'},
            {'1', '3', 'n'},
            {'9', '5', 'n'},
            {'5', '5', 'n'},
            {'4', '4', 'n'},
            {'8', '1', 'v'},
            {'2', '8', 'n'},
            {'1', '0', 'v'},
            {'0', '2', 'n'},
            {'1', '5', 'n'},
            {'6', '0', 'v'},
            {'9', '3', 'v'},
            {'7', '8', 'v'},
            {'2', '6', 'v'},
            {'4', '1', 'v'},
            {'8', '3', 'v'},
            {'9', '6', 'v'},
            {'4', '9', 'n'},
            {'2', '7', 'n'},
            {'4', '5', 'v'},
            {'0', '2', 'n'},
            {'3', '8', 'v'},
            {'4', '9', 'v'},
            {'0', '7', 'n'},
            {'8', '3', 'n'},
            {'6', '4', 'v'},
            {'4', '2', 'n'},
            {'9', '6', 'v'},
            {'3', '7', 'n'},
            {'4', '5', 'n'},
            {'8', '2', 'v'},
            {'5', '6', 'v'},
            {'9', '9', 'n'},
            {'6', '8', 'n'},
            {'2', '6', 'n'},
            {'6', '2', 'n'},
            {'2', '7', 'v'},
            {'8', '5', 'n'},
            {'6', '2', 'v'},
            {'9', '2', 'v'},
            {'1', '8', 'v'},
            {'5', '3', 'v'},
            {'6', '9', 'n'},
            {'5', '6', 'n'},
            {'0', '3', 'n'},
            {'1', '8', 'n'},
            {'2', '3', 'v'},
            {'4', '7', 'n'},
            {'4', '9', 'v'},
            {'0', '9', 'v'},
            {'9', '4', 'v'},
            {'3', '8', 'v'},
            {'7', '9', 'v'},
            {'2', '9', 'v'},
            {'4', '8', 'v'},
            {'1', '6', 'v'},
            {'1', '2', 'n'},
            {'9', '2', 'n'},
            {'8', '0', 'n'},
            {'6', '9', 'v'},
            {'3', '9', 'n'},
            {'6', '7', 'n'},
            {'4', '8', 'n'},
            {'4', '9', 'n'},
            {'9', '7', 'n'},
            {'7', '5', 'v'},
            {'6', '2', 'n'},
            {'9', '0', 'v'},
            {'8', '8', 'v'},
            {'5', '7', 'n'},
            {'5', '3', 'n'},
            {'5', '1', 'n'},
            {'1', '7', 'n'},
            {'4', '9', 'n'},
            {'2', '9', 'v'},
            {'3', '1', 'v'},
            {'8', '6', 'v'},
            {'7', '1', 'v'},
            {'6', '2', 'v'},
            {'2', '4', 'v'},
            {'7', '8', 'n'},
        };

        final char[][] B03 = {
            {'y', 'l', 'k', 'w', 'u', 'a', 't', 'u'},
            {'y', 'h'},
            {'c', 'r', 'h', 'l', 'j', 'j'},
            {'c', 'q', 'z', 'c', 'z'},
            {'j', 'f', 'q', 'f', 'f', 'a', 'v', 'z'},
            {'d', 'i', 'n', 'q', 'v', 'x', 'h'},
            {'l', 'z', 'c', 'w'},
            {'z', 'i', 'l', 'v', 'j', 'q', 'l', 't'},
            {'g', 'y', 'h', 's', 'e', 'a', 'n'},
            {'k', 'q', 'h', 'g', 'm', 'k'},
            {'o', 'd', 'a', 'n', 'k', 'q'},
            {'j', 'r', 'u', 'z', 'o', 'v'},
            {'g', 'd', 'i', 'n'},
            {'y', 'g', 'f', 'i', 'q'},
            {'w', 'q', 'n', 'l', 'p', 'm'},
            {'j', 'c', 'q', 'z', 'c', 'z', 'u'},
            {'t', 'p', 'j'},
            {'q', 'h', 'g', 'm', 'k', 'y', 'o'},
            {'v', 'p', 'z', 'm', 'o', 'i', 'd', 's'},
        };

        final char[][] P03 = {
            {'9', '3', 'v'},
            {'0', '7', 'v'},
            {'4', '6', 'v'},
            {'7', '1', 'n'},
            {'7', '7', 'v'},
            {'3', '8', 'v'},
            {'6', '4', 'v'},
            {'2', '9', 'n'},
            {'0', '6', 'v'},
            {'1', '5', 'v'},
            {'1', '1', 'v'},
            {'7', '7', 'n'},
            {'3', '7', 'v'},
            {'5', '4', 'v'},
            {'5', '0', 'n'},
            {'6', '1', 'n'},
            {'2', '4', 'v'},
            {'1', '6', 'v'},
            {'5', '9', 'v'},
        };

        final char[][] B04 = {
            {'q', 'y', 's', 'j', 'r'},
            {'z', 'u', 'n', 'u', 'd', 'z', 'd', 'r'},
            {'s', 'r', 'w', 'd', 'w', 'g', 'z'},
            {'c', 'j', 'c', 'w', 'x', 'l'},
            {'e', 'e', 'a', 'h', 's', 'g', 'e'},
            {'l', 'z', 'u', 'n', 'u', 'd', 'z'},
            {'g', 'h', 'v', 'q', 'i', 'v', 'o', 'l'},
            {'w', 'q', 'm', 'c', 'j', 'c', 'w', 'x'},
            {'m', 'c', 'j', 'c', 'w', 'x', 'l', 's'},
            {'t', 'q', 'c', 's', 'h', 'p'},
            {'o', 'z', 'k', 'l'},
            {'s', 'd', 'm', 'b', 'j'},
            {'j', 'r', 'n', 'c', 't', 'q', 't'},
            {'t', 'l', 'w', 't', 'l', 'i', 'k'},
            {'t', 'o', 'z', 'k', 'l', 'x'},
            {'g', 'a', 't', 'h', 'y', 'z', 'g'},
            {'q', 'y', 's'},
            {'t', 'z', 'i', 'g', 'w'},
            {'y', 'a', 'g', 'n', 'z', 'n'},
            {'e', 'd', 'v', 'c'},
            {'x', 'c', 'n'},
            {'y', 'z', 'g', 'z', 'q'},
            {'c', 's', 'h', 'p', 'l'},
            {'u', 'n', 'u'},
            {'l', 's', 'b', 'f'},
            {'h', 't', 'q', 'c', 's', 'h', 'p', 'l'},
            {'w', 'd', 'w', 'g', 'z', 'd'},
            {'x', 'z', 'o', 'x', 'q', 'i', 'z'},
            {'f', 'x', 'm', 'f', 'f', 'e', 'b', 'u'},
            {'n', 'c'},
            {'a', 't', 'n', 'r'},
            {'u', 'g', 'z', 'h', 'k', 'q', 'f', 'r', 'm'},
            {'a', 'h', 's', 'g', 'e', 'i', 'u', 'c', 'a'},
            {'o', 'y'},
            {'e', 'u'},
            {'n', 'e', 'd'},
            {'g', 'p'},
            {'h', 'k', 'q', 'f', 'r'},
            {'a', 'j', 'y', 'g', 'f', 'a', 'g', 'p', 'l'},
            {'w', 'u', 'g', 'z', 'h', 'k', 'q', 'f', 'r'},
            {'j', 'z', 'x'},
            {'s', 'g', 'e', 'i', 'u', 'c', 'a'},
            {'v', 'z', 't'},
            {'l', 's', 't', 'w', 'a', 't', 'z'},
            {'g', 'w', 'u', 'p', 'y', 'c', 'y'},
            {'d', 'r'},
            {'v', 'c', 'y', 's', 'z', 'n', 'c'},
            {'h', 'g', 'a', 't', 'h', 'y', 'z', 'g', 'z'},
            {'l', 's', 't'},
            {'q', 'k', 'l'},
            {'d', 'm', 'k'},
            {'u', 'n', 'u', 'd', 'z', 'd'},
            {'h', 's', 'g', 'e', 'i', 'u'},
            {'r', 'v', 'u', 'f', 'x', 'm', 'f', 'f'},
            {'p', 'l', 's', 'b', 'f'},
            {'q', 'h', 'm', 'f', 'x', 'p', 'a', 'y'},
            {'g', 'v'},
            {'p', 'a', 'i'},
            {'e', 'e'},
            {'e', 'd', 'v', 'c', 'y', 's', 'z'},
            {'j', 'k'},
            {'a', 'j'},
            {'t', 'o', 'z'},
            {'h', 't', 'q', 'c'},
            {'g', 'a', 'g', 'w', 'u', 'p', 'y'},
            {'z', 't'},
            {'t', 'o', 'z', 'k', 'l', 'x', 'c'},
            {'a', 't', 'h', 'y', 'z', 'g', 'z', 'q', 'h'},
            {'a', 't', 'n', 'r', 'v'},
            {'o', 'm'},
            {'l', 'm', 'o', 'j', 'u', 'h', 'z'},
            {'j', 'y', 'g'},
            {'g', 'z'},
            {'e', 'd', 'k', 'w', 'r', 'c', 'h'},
            {'c', 'y', 's', 'z', 'n', 'c'},
            {'v', 'r', 'x'},
            {'o', 'y', 'a', 'g'},
        };

        final char[][] P04 = {
            {'0', '3', 'n'},
            {'0', '8', 'v'},
            {'4', '2', 'v'},
            {'9', '9', 'n'},
            {'4', '0', 'n'},
            {'0', '7', 'v'},
            {'7', '1', 'n'},
            {'6', '9', 'n'},
            {'8', '9', 'n'},
            {'8', '2', 'v'},
            {'9', '4', 'v'},
            {'2', '3', 'v'},
            {'3', '3', 'n'},
            {'9', '3', 'n'},
            {'9', '3', 'v'},
            {'7', '1', 'v'},
            {'0', '3', 'n'},
            {'8', '2', 'n'},
            {'1', '6', 'v'},
            {'3', '5', 'n'},
            {'9', '8', 'v'},
            {'7', '5', 'v'},
            {'8', '4', 'v'},
            {'0', '9', 'v'},
            {'9', '7', 'n'},
            {'8', '1', 'v'},
            {'4', '4', 'v'},
            {'9', '8', 'n'},
            {'5', '7', 'v'},
            {'5', '3', 'n'},
            {'5', '1', 'v'},
            {'5', '6', 'n'},
            {'6', '0', 'n'},
            {'1', '5', 'v'},
            {'0', '5', 'v'},
            {'0', '4', 'n'},
            {'7', '7', 'n'},
            {'8', '6', 'n'},
            {'1', '7', 'n'},
            {'4', '6', 'n'},
            {'3', '8', 'n'},
            {'8', '0', 'n'},
            {'9', '1', 'v'},
            {'3', '2', 'n'},
            {'6', '8', 'v'},
            {'1', '1', 'v'},
            {'5', '5', 'n'},
            {'7', '0', 'v'},
            {'3', '2', 'n'},
            {'3', '0', 'v'},
            {'1', '1', 'n'},
            {'0', '9', 'v'},
            {'7', '0', 'n'},
            {'5', '4', 'v'},
            {'8', '7', 'n'},
            {'7', '9', 'v'},
            {'9', '0', 'v'},
            {'4', '1', 'n'},
            {'4', '0', 'n'},
            {'3', '5', 'n'},
            {'3', '3', 'v'},
            {'1', '7', 'n'},
            {'9', '3', 'v'},
            {'8', '1', 'v'},
            {'6', '6', 'v'},
            {'9', '2', 'v'},
            {'9', '3', 'v'},
            {'7', '2', 'v'},
            {'5', '1', 'v'},
            {'1', '5', 'n'},
            {'8', '8', 'v'},
            {'2', '7', 'n'},
            {'6', '8', 'n'},
            {'1', '4', 'n'},
            {'6', '5', 'n'},
            {'0', '2', 'n'},
            {'1', '5', 'v'},
        };

        final char[][] B05 = {
            {'t', 'b', 'i', 'i', 't', 's', 'v', 'p', 'm'},
            {'p', 't', 'y', 'r', 'r'},
            {'a', 'c', 'm', 'm', 'h', 'g', 'j', 'y'},
            {'v', 'e', 'a', 'r', 'o', 'k'},
            {'j', 'y'},
            {'a', 'r', 'o'},
            {'c', 's', 'c', 'x', 'j', 'a', 'j'},
            {'z', 'l', 'l', 'b', 'c', 'z', 'c'},
            {'b', 'i', 'i', 't', 's', 'v', 'p', 'm', 'w'},
            {'v', 'm'},
            {'v', 'f', 'r', 'l', 'm', 'o', 'a', 'l', 'p'},
            {'m', 'o', 'a', 'l', 'p', 'y', 'q', 'g'},
            {'b', 'r', 'j', 'a', 'l'},
            {'d', 'v', 'f', 't', 'b'},
            {'j', 'g', 'u', 'c', 'j', 's'},
            {'t', 'v', 'e', 'a', 'r', 'o'},
            {'l', 'n', 'v', 'd', 'r', 'm', 'j', 'n'},
            {'g', 's', 'g', 'v', 'v', 'z', 'g', 'e', 'a'},
            {'s', 'g', 'a', 't', 'y'},
            {'l', 'f', 'n', 'g', 'h', 'y', 't'},
            {'i', 'r', 't', 'j', 'l', 'z', 'f', 'u'},
            {'q', 'p', 'o', 'l', 'm', 'f', 't', 'w'},
            {'t', 's', 'v', 'p', 'm'},
            {'b', 'i', 'l', 'f', 'n', 'g', 'h', 'y', 't'},
            {'q', 'f', 'm'},
            {'l', 'r', 't'},
            {'x', 'z', 'q', 'c', 's'},
            {'j', 'c', 'l', 'a'},
            {'e', 'a', 'c', 'm', 'm', 'h', 'g'},
            {'s', 'g', 'v', 'v', 'z', 'g', 'e'},
            {'a', 'w', 'e', 'r', 'x'},
            {'l', 'z', 'f'},
            {'r', 'o', 'k'},
            {'h', 'n', 'p', 'g', 'z', 'v', 'i', 't'},
            {'c', 't'},
            {'l', 'n', 'v', 'd', 'r', 'm'},
            {'j', 'z', 'l'},
        };

        final char[][] P05 = {
            {'4', '3', 'v'},
            {'5', '9', 'n'},
            {'8', '1', 'n'},
            {'8', '6', 'v'},
            {'7', '8', 'v'},
            {'8', '8', 'v'},
            {'1', '6', 'v'},
            {'1', '4', 'n'},
            {'4', '4', 'v'},
            {'7', '2', 'n'},
            {'3', '1', 'v'},
            {'3', '5', 'v'},
            {'5', '8', 'n'},
            {'4', '0', 'v'},
            {'0', '0', 'v'},
            {'8', '5', 'v'},
            {'1', '0', 'n'},
            {'0', '1', 'n'},
            {'1', '7', 'n'},
            {'2', '4', 'v'},
            {'2', '3', 'n'},
            {'9', '0', 'n'},
            {'4', '7', 'v'},
            {'2', '2', 'v'},
            {'1', '5', 'n'},
            {'9', '8', 'n'},
            {'1', '3', 'v'},
            {'5', '3', 'v'},
            {'7', '1', 'n'},
            {'1', '1', 'n'},
            {'9', '7', 'n'},
            {'6', '3', 'n'},
            {'8', '9', 'v'},
            {'9', '2', 'n'},
            {'8', '4', 'v'},
            {'1', '0', 'n'},
            {'0', '4', 'n'},
        };

        final char[][] B06 = {
            {'m', 'h', 'q', 'l', 'u', 'l', 'p'},
            {'w', 's', 'g', 'o', 'm', 'c', 'b', 'o', 's'},
            {'v', 'l', 'c', 'a', 'e', 'a'},
            {'h', 'c', 'q', 'r', 'w', 'i', 'b'},
            {'n', 'r', 'y', 'u', 'f', 'l', 'b', 'b'},
            {'g', 'a', 'l', 'u', 'f', 'c', 'e'},
            {'n', 'v', 'v'},
            {'r', 'h'},
            {'h', 'l', 'i'},
            {'a', 'i', 'q', 'q', 'e', 'p', 'u', 'c', 'o'},
            {'w', 'i', 'b', 'j', 'o', 'f', 'c', 'v'},
            {'p', 'j', 'q', 'y', 'r', 'm', 'n', 'x'},
            {'q', 'w', 's', 'g', 'o'},
            {'h', 'c', 'q', 'r', 'w', 'i', 'b', 'j'},
            {'u', 'r'},
            {'u', 's', 'y', 'c', 'r', 'z', 'r', 'r'},
            {'r', 'v', 'l'},
            {'r', 'x', 'd', 'l', 'y', 'j', 'f', 'y', 't'},
            {'f', 'w', 'o', 's', 'b'},
            {'l', 'y', 'n', 'u', 'i', 'v'},
            {'x', 'v', 'k', 'v', 'a'},
            {'r', 'h', 'q', 'c', 'd', 'r', 'f'},
            {'f', 'b', 'j', 'a', 'x'},
            {'r', 'z', 'r', 'r', 'x', 'd', 'l', 'y', 'j'},
            {'x', 'x', 'b', 'j', 'b', 'd', 'r'},
            {'r', 'd', 'y'},
            {'u', 'r', 'd', 'y', 'h', 'l', 'i', 'a'},
            {'j', 'o', 'f', 'c', 'v', 'q', 'w', 'k'},
            {'p', 'y', 'j', 'f', 'm', 'h', 'q', 'l'},
            {'f', 'd', 'a', 'x', 'p', 'j', 'q'},
            {'u', 'f', 'c', 'e', 'i', 'n', 'r', 'h', 'q'},
            {'b', 'b', 'q', 'z', 'n', 'm', 's', 'z'},
            {'q', 'o', 'q'},
            {'c', 'q', 'r', 'w', 'i', 'b', 'j'},
            {'r', 'v'},
            {'a', 'w', 'o'},
            {'a', 'i', 'q', 'q', 'e', 'p', 'u', 'c', 'o'},
            {'q', 'q', 'n', 'a', 'w', 'o'},
            {'u', 'f', 'c', 'e'},
            {'a', 'b', 'z', 'c', 'k'},
            {'o', 's', 'j', 'r', 'v'},
            {'c', 'm', 'o', 'd', 'j', 'l', 'l', 'a'},
            {'i', 'o', 's', 'j', 'r', 'v', 'l', 'c', 'a'},
            {'o', 'c', 'q', 'w', 's', 'g'},
            {'f', 'd', 'a', 'x', 'p', 'j', 'q'},
            {'s', 'g', 'o', 'm', 'c', 'b', 'o', 's'},
            {'a', 'r', 'm', 'n', 'x', 'a', 'i', 'a', 'o'},
            {'x', 'd', 'l', 'y', 'j', 'f', 'y'},
            {'n', 'a'},
            {'p', 'j', 'q', 'a', 'r', 'm', 'n', 'x'},
            {'o', 'd', 'j', 'l'},
            {'b', 'j'},
            {'g', 'd'},
            {'f', 'g'},
            {'o', 's', 'b'},
            {'d', 'a', 'y', 'a', 'b', 'i'},
            {'b', 'j', 'o'},
            {'e', 'h', 'c'},
            {'c', 'r', 'g'},
            {'c', 'q'},
            {'q', 'o', 'q', 'x'},
            {'c', 'r', 'g', 'f', 'd', 'b', 'b', 'j', 'g'},
            {'a', 'a', 'y', 'w', 'p', 'e', 'y', 'm'},
            {'b', 'z', 'c', 'k'},
            {'u', 'n', 'o', 'd', 'q', 'n', 'd', 'y'},
            {'s', 'j'},
            {'g', 'l', 'q'},
            {'q', 'y', 'v', 'q', 'o', 'q', 'x'},
            {'g', 'l', 'q', 'n', 'r', 'y', 'u'},
            {'l', 'u', 'f'},
            {'g', 'f', 'd'},
            {'e', 'h', 'c', 'q', 'r', 'w'},
            {'q', 'r', 'w', 'i'},
            {'q', 'q', 'e'},
            {'x', 'p', 'j', 'q', 'a', 'r', 'm', 'n', 'x'},
            {'y', 'a', 'a', 'y', 'w'},
            {'o', 'd', 'j'},
            {'s', 'y', 'c', 'r', 'z', 'r'},
            {'l', 'y', 'n', 'u', 'i', 'v', 'd', 'd'},
            {'l', 'u', 'f', 'c', 'e', 'i', 'n', 'r', 'h'},
        };

        final char[][] P06 = {
            {'1', '5', 'v'},
            {'2', '8', 'v'},
            {'4', '7', 'v'},
            {'1', '6', 'n'},
            {'3', '0', 'n'},
            {'0', '0', 'v'},
            {'3', '7', 'n'},
            {'0', '9', 'v'},
            {'6', '4', 'v'},
            {'6', '7', 'n'},
            {'5', '6', 'n'},
            {'8', '5', 'v'},
            {'2', '7', 'v'},
            {'1', '6', 'n'},
            {'6', '0', 'v'},
            {'1', '9', 'n'},
            {'4', '6', 'v'},
            {'8', '9', 'n'},
            {'1', '4', 'n'},
            {'0', '2', 'n'},
            {'8', '4', 'n'},
            {'0', '9', 'v'},
            {'5', '8', 'n'},
            {'5', '9', 'n'},
            {'9', '8', 'v'},
            {'6', '1', 'v'},
            {'6', '0', 'v'},
            {'8', '6', 'n'},
            {'1', '1', 'v'},
            {'8', '1', 'v'},
            {'0', '3', 'v'},
            {'9', '0', 'n'},
            {'9', '5', 'v'},
            {'2', '6', 'n'},
            {'4', '6', 'v'},
            {'2', '3', 'v'},
            {'6', '7', 'n'},
            {'2', '0', 'v'},
            {'0', '3', 'v'},
            {'6', '7', 'v'},
            {'4', '3', 'v'},
            {'0', '5', 'n'},
            {'4', '2', 'v'},
            {'2', '5', 'v'},
            {'8', '1', 'v'},
            {'2', '9', 'v'},
            {'8', '8', 'v'},
            {'9', '9', 'n'},
            {'2', '2', 'v'},
            {'8', '5', 'v'},
            {'2', '5', 'n'},
            {'7', '6', 'n'},
            {'7', '1', 'v'},
            {'7', '0', 'v'},
            {'3', '4', 'n'},
            {'7', '2', 'v'},
            {'7', '6', 'n'},
            {'0', '6', 'n'},
            {'5', '1', 'n'},
            {'2', '6', 'n'},
            {'9', '5', 'v'},
            {'5', '1', 'n'},
            {'7', '3', 'n'},
            {'6', '8', 'v'},
            {'3', '2', 'v'},
            {'4', '4', 'v'},
            {'0', '0', 'n'},
            {'9', '2', 'v'},
            {'0', '0', 'n'},
            {'0', '2', 'v'},
            {'7', '1', 'n'},
            {'0', '6', 'n'},
            {'3', '6', 'n'},
            {'8', '7', 'n'},
            {'8', '4', 'v'},
            {'6', '3', 'n'},
            {'2', '5', 'n'},
            {'2', '9', 'n'},
            {'0', '2', 'n'},
            {'0', '2', 'v'},
        };

        final char[][] B07 = {
            {'z', 'v', 'm', 'l', 'w', 'x', 'k', 'a', 'u'},
            {'u', 'r', 'a'},
            {'l', 'y', 'u', 'u', 's', 'f'},
            {'u', 'h', 'f', 'k'},
            {'y', 'v', 'b', 'f', 'r'},
            {'k', 'n', 'h', 'v', 'x', 'c', 'y'},
            {'v', 'm', 'l', 'w', 'x', 'k', 'a', 'u', 'f'},
            {'e', 'l', 'x', 'r', 'd'},
            {'x', 'n', 'g', 'i'},
            {'v', 'x', 'c', 'y', 'u', 'h', 'f', 'k'},
            {'t', 'l', 'g', 'i', 's', 'f'},
            {'l', 'e', 'w', 'y'},
            {'e', 'h', 'r', 'y'},
            {'z', 'v', 'm', 'l'},
            {'v', 'b', 'f'},
            {'b', 'd'},
            {'q', 'k', 'f', 'd', 'a', 'f', 'p'},
        };

        final char[][] P07 = {
            {'5', '1', 'v'},
            {'8', '6', 'n'},
            {'8', '3', 'v'},
            {'2', '9', 'v'},
            {'8', '4', 'n'},
            {'2', '2', 'v'},
            {'5', '2', 'v'},
            {'6', '4', 'v'},
            {'1', '3', 'n'},
            {'2', '5', 'v'},
            {'7', '3', 'n'},
            {'5', '4', 'n'},
            {'6', '1', 'n'},
            {'5', '1', 'v'},
            {'9', '4', 'n'},
            {'1', '1', 'n'},
            {'0', '2', 'v'},
        };

        final char[][] B08 = {
            {'p', 'p', 'f', 'b', 'v', 'l'},
            {'w', 'y', 'a', 'v', 'p', 'e', 'z', 'r'},
            {'y', 'p', 'a', 'u', 'a', 'l', 'l'},
            {'e', 'a'},
            {'d', 't', 'w', 'h', 'l', 'i', 'q', 'r', 'd'},
            {'g', 'r', 'c', 'e', 'r', 'd'},
            {'v', 'c'},
            {'n', 'g', 'r', 'c', 'e'},
            {'h', 'w', 'd', 'x', 'y'},
        };

        final char[][] P08 = {
            {'5', '5', 'n'},
            {'9', '2', 'v'},
            {'2', '6', 'v'},
            {'5', '8', 'n'},
            {'0', '7', 'n'},
            {'0', '2', 'v'},
            {'1', '1', 'v'},
            {'0', '1', 'v'},
            {'5', '3', 'n'},
        };

        final char[][] B09 = {
            {'c', 'x', 'w', 'o'},
            {'t', 'e', 'x', 's', 'f', 'v', 'k', 'x', 't'},
            {'p', 'z'},
            {'j', 'q', 'a', 'd'},
            {'z', 'y', 'x', 'h', 'f', 'a', 'b'},
            {'y', 'c', 'k', 'z'},
            {'a', 'u'},
            {'m', 'u', 'y', 'l', 'q', 'r', 'l'},
            {'x', 'd', 'a', 'c', 'j'},
            {'e', 't'},
        };

        final char[][] P09 = {
            {'2', '7', 'v'},
            {'1', '5', 'v'},
            {'6', '2', 'v'},
            {'0', '0', 'v'},
            {'8', '6', 'n'},
            {'9', '7', 'n'},
            {'8', '1', 'v'},
            {'5', '0', 'n'},
            {'6', '8', 'v'},
            {'4', '7', 'v'},
        };

        final char[][] B10 = {
            {'z', 'f', 'l', 'n'},
            {'l', 'f', 'k', 'z'},
            {'s', 'l', 'f', 'd', 'w', 'd'},
            {'j', 'e', 'g', 'g', 'x', 'o'},
            {'o', 'm', 'r', 'z', 'k', 'j', 'g', 'c', 'd'},
            {'z', 'j', 'h', 'o', 'x', 'q', 'a', 'o'},
            {'m', 'a', 'n'},
            {'g', 's', 'k', 'o', 'c', 'y', 'c'},
            {'i', 'd', 'i', 'y', 'p', 'r'},
        };

        final char[][] P10 = {
            {'7', '9', 'v'},
            {'4', '9', 'n'},
            {'0', '4', 'v'},
            {'2', '8', 'n'},
            {'9', '7', 'v'},
            {'1', '6', 'v'},
            {'7', '4', 'n'},
            {'6', '7', 'n'},
            {'2', '9', 'v'},
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