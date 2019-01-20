package jp.ac.uryukyu.ie.e185762;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {

    /**
     * テスト用に用意した エネミーのステータスが書かれたテキストファイルを
     * Enemyクラスのフィールド関数に当てはめることができるかの確認
     *
     * @throws IOException　ファイル入出力時に起こる例外
     */
    @Test
    void makeAvilityList() throws IOException {
        Enemy enemy = new Enemy();

        String test_name = "テストエネミー";
        int test_attack= 13;
        int test_defense = 12;
        int test_physical = 11;
        int test_speed = 10;

        enemy.MakeAvilityList("./sentence/test_sentence/test_enemy.txt");

        assertEquals(test_name,enemy.enemy_name);
        assertEquals(test_attack,enemy.enemy_attack);
        assertEquals(test_defense,enemy.enemy_defense);
        assertEquals(test_physical,enemy.enemy_physical);
        assertEquals(test_speed,enemy.enemy_speed);


    }
}