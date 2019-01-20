package jp.ac.uryukyu.ie.e185762;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    /**
     * テスト用に用意したキャラクタのステータスが書かれたテキストファイルを
     * Characterクラスのフィールド関数に当てはめることができるかの確認
     *
     * @throws IOException　ファイル入出力時に起こる例外
     */
    @Test
    void makeAvilityList() throws IOException {
        Character character = new Character();

        String test_name = "テストキャラ";
        int test_attack= 10;
        int test_defense = 11;
        int test_physical = 12;
        int test_speed = 13;

        character.MakeAvilityList("./sentence/test_sentence/test_character.txt");

        assertEquals(test_name,character.character_name);
        assertEquals(test_attack,character.character_attack);
        assertEquals(test_defense,character.character_defense);
        assertEquals(test_physical,character.character_physical);
        assertEquals(test_speed,character.character_speed);



    }
}