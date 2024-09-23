package de.tum.cit.ase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.PosixFilePermission;
import java.util.*;

public final class FileSystemAccessDemo {

    public static void main(String[] args) {
        accessFileSystemViaFilesRead("pom123.xml");
        accessFileSystemViaFilesWrite("pom123.xml");
        accessFileSystemViaFilesExecute("pom123.xml");
        accessFileSystemViaFilesDelete("pom123.xml");
    }

    public static void accessFileSystemViaFilesRead(String filePathString) {
        try {
            byte[] fileContent = Files.readAllBytes(Paths.get(filePathString));
            System.out.println("Read operation successful. File content length: " + fileContent.length);
        } catch (IOException e) {
            throw new RuntimeException("Error reading file: " + filePathString, e);
        }
    }

    public static void accessFileSystemViaFilesWrite(String filePathString) {
        try {
            String content = "This is sample data for writing into the file.";
            Files.write(Paths.get(filePathString), content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            System.out.println("Write operation successful.");
        } catch (IOException e) {
            throw new RuntimeException("Error writing to file: " + filePathString, e);
        }
    }

    public static void accessFileSystemViaFilesExecute(String filePathString) {
        try {
            Path filePath = Paths.get(filePathString);
            boolean isExecutable = Files.isExecutable(filePath);
            System.out.println("Is file executable? " + isExecutable);

            Files.setPosixFilePermissions(filePath, Set.of(PosixFilePermission.OWNER_EXECUTE));
            System.out.println("Execute permission set.");
        } catch (IOException e) {
            throw new RuntimeException("Error setting execute permissions on file: " + filePathString, e);
        }
    }

    public static void accessFileSystemViaFilesDelete(String filePathString) {
        try {
            Files.delete(Paths.get(filePathString));
            System.out.println("Delete operation successful.");
        } catch (IOException e) {
            throw new RuntimeException("Error deleting file: " + filePathString, e);
        }
    }

}
