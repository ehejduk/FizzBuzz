package pl.agh.mwo;

public class FizzBuzz {
	public String printNumbers() {
		String liczby = "";
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					liczby += "FizzBuzz";
					liczby += "\n";
				} else {
					liczby += "Fizz";
					liczby += "\n";
				}

			} else if (i % 5 == 0) {
				liczby += "Buzz";
				liczby += "\n";
			}

			else {

				liczby += i;
				liczby += "\n";
			}
		}
		return liczby;
	}

}
