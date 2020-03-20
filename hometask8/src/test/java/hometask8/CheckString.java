package hometask8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CheckString {
/*		TO DO list
*	“ABCD” => “BCD” 
    “AACD” => “CD”  
    “BACD” => “BCD” 
    “BBAA” => “BBAA”        
    “AABAA” => “BAA” 
* 
*/
RemoveAfromString object;
	@BeforeEach
	void setUp() throws Exception {
		object=new RemoveAfromString();	
	}
	@Test
	void test1Aat1character(){
	assertEquals("BCD",object.swap("ABCD"));
	}
	@Test
	void test2Aas2characters(){
	assertEquals("CD",object.swap("AACD"));
						}
	@Test
	void test1Aat2character(){
	assertEquals("BCD",object.swap("BACD"));
						}
	@Test
	void testnoAcharacters(){
	assertEquals("BBAA",object.swap("BBAA"));
						}
	@Test
	void characters2Awithdifferentlength(){
	assertEquals("BAA",object.swap("AABAA"));
						}
}
