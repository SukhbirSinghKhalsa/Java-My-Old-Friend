/*
x |  y | x&y | x|y | x^y |
0 |  0 |  0  | 0   |  0  |
0 |  1 |  0  | 1   |  1  |
1 |  0 |  0  | 1   |  1  |
1 |  1 |  1  | 1   |  0  |
*/
public class BitwiseOperator {
static public void main(String args[]) {

int value1 = 10;
int value2 = 9;

System.out.println( bitwiseAND(value1,value2) );
System.out.println( bitwiseOR(value1,value2) );
System.out.println( bitwiseXOR(value1,value2) );
}

static int bitwiseAND(int value1, int value2) {
// & operator
return value1 & value2;
}
static int bitwiseOR(int value1, int value2) {
// | operator
return value1 | value2;
}
static int bitwiseXOR(int value1, int value2) {
// ^ operator
return value1 ^ value2;
}

}
