package testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Sample.FloorSquareRoot;

public class Test001 {
	 @Test
	 public void testA() {
			assertEquals(3, FloorSquareRoot.floorSqrt(11));
	 }

	 @Test
	 public void testB() {
			assertEquals(4, FloorSquareRoot.floorSqrt(20));
	 }
}