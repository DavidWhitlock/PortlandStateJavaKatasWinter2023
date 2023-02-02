package edu.pdx.cs410J.room4;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class DiamondRoom4Test
{

  @Test
  void canInstantiateKataClass() {

    new DiamondRoom4();
  }
  @Test
  void lettersInOrderContainsOnlyCharacters(){
    DiamondRoom4 dr4 = new DiamondRoom4();
    for (String c : dr4.lettersInOrder){
      assertThat(c.length(), equalTo(1));
    }
  }
  @Test
  void onlyOneSpacePerCharacter(){

  }

}