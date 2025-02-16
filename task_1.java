@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	assertEquals(
            "Ожидалось, что при возрасте 19 метод вернёт true, но вернул false",
            true, 
            isAdult
        );
}
