
public class FizzBuzz {
	public static void main(String[] args) {
		
		for(int i = 1; i < 101; i++ ) {
			//ここは100回数える箱の中　出力してから繰り返す
			if (( i % 3 == 0) && ( i % 5 == 0)) {
				System.out.println("FizzBuzz");
				continue;
			}else if( i % 3 == 0) {
				System.out.println("Fizz");
				continue;
			}else  if( i % 5 == 0) {
				System.out.println("Buzz");
				continue;
			}else
				System.out.println(i);
			
		}
		
	}

}

//Fizz は  i % 3 == 0 の時
//Buzz は　i % 5 == 0 の時
//FizzBuzz　は　Fizz かつ Buzz　の時