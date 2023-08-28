package com.memeda.impl;

import com.memeda.ReadFile;
import org.springframework.asm.MethodTooLargeException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @description:
 * @author: hugememeda
 * @date: 2023-08-14 07:14:38
 * @version: 1.0.0
 */
public class ReadImageFile implements ReadFile {
    @Override
    public void readFile() throws IOException {
//        System.out.println("ReadImageFile");
        throw new IOException("nihao");
    }
}
