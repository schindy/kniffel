package controllers;

import java.util.List;

import play.mvc.Controller;

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
	  if (spielername == null) {
		  redirect("/");
		  return;
	  }

    for(String s : spielername)
    {
      System.out.println (s);
    }
    render (spielername);
  }
}