package com.example.education.regexp;

import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.*;
import java.nio.charset.Charset;

import static org.assertj.core.api.Assertions.assertThat;

public class FileTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void createFoldersAndFileInside() throws IOException {
        File file = temporaryFolder.newFile("1.txt");

        FileUtils.write(file, "hello world" + System.lineSeparator() + "one more thing",
                Charset.defaultCharset());

        assertThat(FileUtils.readLines(file, Charset.defaultCharset()))
                .hasSize(2)
                .containsExactly("hello world", "one more thing");
    }

    @Test
    public void readViaStreamIntoStringBuilder() throws IOException {
        File file = temporaryFolder.newFile("1.txt");

        FileUtils.write(file, "hello world" + System.lineSeparator() + "one more thing",
                Charset.defaultCharset());

        FileInputStream fis = new FileInputStream(file);

        assertThat(getFileContent(fis, Charset.defaultCharset()).toString())
                .isEqualTo("hello world" + System.lineSeparator()
                        + "one more thing" + System.lineSeparator());
    }

    private static StringBuilder getFileContent(FileInputStream fis, Charset encoding) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(fis, encoding))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
            return sb;
        }
    }
}
