package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller
{

  public static void index(int anzahl)
  {
    if (anzahl == 0)
    {
      anzahl = 1;
    }
    System.out.println (anzahl);
    render (anzahl);
  }


  public static void kniffel(List<String> spielername)
  {
    for(String s : spielername)
    {
      System.out.println (s);
    }
    render (spielername);
  }
}