package jp.ac.uryukyu.ie.e185762;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ToolsTest {

    /**
     * 指定したテキストファイルがString型になっているか確認
     * assertEquals()は両方の変数の型が一致しないといけないため、この仕様を利用してString型の引数を用いて型を確認
     *
     * @throws IOException　ファイル入出力時に起こる例外
     */
    @Test
    void fileToString() throws IOException {
        Tools tools = new Tools();

        String sentence ="これはテストです";

        assertEquals(sentence,tools.fileToString(new File("./sentence/test_sentence/test_sentence.txt")));
    }
}