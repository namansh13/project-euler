package projectEuler;

public class Problem61 {
public static void main(String[] args){
	
}
public static int triangle(int n){
	int g=n*(n+1)/2;
	return g;
}
public static int square(int n){
	int g=n*n;
	return g;
}
public static int pentagonal(int n){
	int g=n*(3*n-1)/2	;
	return g;
}
public static int hexagonal(int n){
	int g=n*(2*n-1)	;
	return g;
}
public static int heptagonal(int n){
	int g=n*(5*n-3)/2	;
	return g;
}
public static int octagonal(int n){
	int g=n*(3*n-2)	;
	return g;
}

}
