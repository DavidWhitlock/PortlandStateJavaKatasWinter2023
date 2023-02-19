package edu.pdx.cs410J.room13;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DiamondRoom13Test
{

  @Test
  void a() {
    String diamond =
      "A\n";
    assertThat(DiamondRoom13.diamond('A'), equalTo(diamond));
  }
  @Test
  void b() {
    String diamond =
      " A\n" +
      "B B\n" +
      " A\n";
    assertThat(DiamondRoom13.diamond('B'), equalTo(diamond));
  }

  @Test
  void c() {
    String diamond =
      "  A\n" +
      " B B\n" +
      "C   C\n" +
      " B B\n" +
      "  A\n" +
        "";
    assertThat(DiamondRoom13.diamond('C'), equalTo(diamond));
  }

  @Test
  void d() {
    String diamond =
      "   A\n" +
      "  B B\n" +
      " C   C\n" +
      "D     D\n" +
      " C   C\n" +
      "  B B\n" +
      "   A\n" +
        "";
    assertThat(DiamondRoom13.diamond('D'), equalTo(diamond));
  }

  @Test
  void e() {
    String diamond =
      "    A\n" +
      "   B B\n" +
      "  C   C\n" +
      " D     D\n" +
      "E       E\n" +
      " D     D\n" +
      "  C   C\n" +
      "   B B\n" +
      "    A\n" +
      "";
    assertThat(DiamondRoom13.diamond('E'), equalTo(diamond));
  }

}
