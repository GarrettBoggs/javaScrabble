class Scrabble {

  public int total = 0;
  public char[] point1 = {'a', 'e', 'i' ,'o', 'u', 'l' ,'n', 'r', 's', 't'};
  public char[] point2 = {'d', 'g'};
  public char[] point3 = {'b', 'c' , 'm', 'p'};
  public char[] point4 = {'f', 'h' , 'v', 'y', 'w'};
  public char[] point5 = {'k'};
  public char[] point8 = {'j', 'x'};
  public char[] point10 = {'q', 'z'};

  public Integer calculateScore(String letter) {

  for(int j = 0; j < letter.length() ; j ++) {

    for (int i = 0; i < point1.length ; i++) {
      if(letter.charAt(j) == point1[i]) {
        total += 1;
      }
    }

    for (int i = 0; i < point2.length ; i++) {
      if(letter.charAt(j) == point2[i]) {
        total += 2;
      }
    }

    for (int i = 0; i < point3.length ; i++) {
      if(letter.charAt(j) == point3[i]) {
        total += 3;
      }
    }

    for (int i = 0; i < point4.length ; i++) {
      if(letter.charAt(j) == point4[i]) {
        total += 4;
      }
    }

    for (int i = 0; i < point5.length ; i++) {
      if(letter.charAt(j) == point5[i]) {
        total += 5;
      }
    }

    for (int i = 0; i < point8.length ; i++) {
      if(letter.charAt(j) == point8[i]) {
        total += 8;
      }
    }

    for (int i = 0; i < point10.length ; i++) {
      if(letter.charAt(j) == point10[i]) {
        total += 10;
      }
    }
  }

    return total;
  }
}
