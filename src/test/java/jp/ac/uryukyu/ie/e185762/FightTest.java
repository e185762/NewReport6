package jp.ac.uryukyu.ie.e185762;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FightTest {


    /**
     * 「かいふく」の行動を行なった時に、回復後のHPがキャラクタのMaxHPよりも高くなる場合は
     * 超えた回復量は切り捨てて、回復後のHPがキャラクタのMaxHPよりも高くならないようになっているかの確認
     * このメソッドでは「かいふく」の後に攻撃処理も行なっているので、それらも考慮した上での値を定めた
     * キャラクタとエネミーのステータスはCharacterTest()とEnemyTest()のテキストファイルを使用した
     *
     * @throws IOException　ファイル入出力時に起こる例外
     */
    @Test
    void HpCure() throws IOException {
        Character character = new Character();
        Enemy enemy = new Enemy();
        Fight fight = new Fight();

        int result_character_hp = 10;

        character.MakeAvilityList("./sentence/test_sentence/test_character.txt");
        enemy.MakeAvilityList("./sentence/test_sentence/test_enemy.txt");

        int[] test_results = fight.HpCure(character,enemy,10,10);

        assertEquals(result_character_hp,test_results[0]);
    }
}