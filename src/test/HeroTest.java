package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.rutmiit2.Hero;
import ru.rutmiit2.Knight;
import ru.rutmiit2.Sword;

class HeroTest {

    @Test
    void getWeaponShouldReturnWeaponChildSword() {
        Hero knight = new Knight("name", 20, 20, 20, 20);
        Assertions.assertEquals(Sword.class, knight.getWeapon().getClass());
    }
}