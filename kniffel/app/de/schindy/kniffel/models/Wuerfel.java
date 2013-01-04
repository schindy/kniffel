package de.schindy.kniffel.models;

import java.util.Random;

public class Wuerfel
{
  int wert = 1;

  public int getWert()
  {
    return wert;
  }
  
  public int wuerfeln()
  {
    Random random = new Random();
    return wert = random.nextInt(5) + 1;
  }
}
