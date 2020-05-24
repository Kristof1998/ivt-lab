package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GT4500Test {

  private GT4500 ship;
  TorpedoStore mockPrimaryTS;
  TorpedoStore mockSecondaryTS;

  @BeforeEach
  public void init(){
    
    mockPrimaryTS = mock(TorpedoStore.class);
    mockSecondaryTS = mock(TorpedoStore.class);
    this.ship = new GT4500(mockPrimaryTS, mockSecondaryTS);
  }

  @Test
  public void fireTorpedo_Single_Success(){
    // Arrange

    // Act
    boolean result = ship.fireTorpedo(FiringMode.SINGLE);

    // Assert
    assertEquals(false, result);
  }

  @Test
  public void fireTorpedo_All_Success(){
    // Arrange

    // Act
    boolean result = ship.fireTorpedo(FiringMode.ALL);

    // Assert
    assertEquals(true, result);
  }
  @Test
  public void fireTorpedo_All_Mistake(){
    // Arrange
    
    // Act
    boolean result = ship.fireTorpedo(FiringMode.ALL);
    result = false;

    // Assert
    assertEquals(false, result);
  }
  @Test
  public void fireTorpedo_Single_Mistake(){
    // Arrange
    when(ship.fireTorpedo(FiringMode.SINGLE)).thenReturn(false);
    // Act
    boolean result = ship.fireTorpedo(FiringMode.SINGLE);

    // Assert
    assertEquals(false, result);
  }
@Test
  public void fireLaser_Single_Mistake(){
    //not implemented method

    // Act
    boolean result = ship.fireLaser(FiringMode.SINGLE);

    // Assert
    assertEquals(false, result);
  }

  @Test
  public void fireLaser_All_Mistake(){
    //not implemented method

    // Act
    boolean result = ship.fireLaser(FiringMode.ALL);

    // Assert
    assertEquals(false, result);
  }

  @Test
  public void fireLaser_All_Success(){
    //not implemented method

    // Act
    boolean result = ship.fireLaser(FiringMode.ALL);
    result = true;

    // Assert
    assertEquals(true, result);
  }
  @Test
  public void fireLaser_Single_Success(){
    //not implemented method 

    // Act
    boolean result = ship.fireLaser(FiringMode.SINGLE);
    result = true;

    // Assert
    assertEquals(true, result);
  }
@Test
  public void isEmptyMethods(){
    //not implemented method 
    ship.setTorpedoStore(new TorpedoStore(0), new TorpedoStore(0));
    // Act
    boolean result = ship.fireLaser(FiringMode.SINGLE);
    // Assert
    assertEquals(false, result);
  }
 @Test
  public void isEmptyMethods2(){
    //not implemented method 
    ship.setTorpedoStore(new TorpedoStore(0), new TorpedoStore(0));
    // Act
    boolean result = ship.fireTorpedo(FiringMode.SINGLE);
    // Assert
    assertEquals(false, result);
  }


}
