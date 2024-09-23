package de.tum.cit.ase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.PosixFilePermission;
import java.util.*;

public final class FileSystemAccessDemo {

    public void accessFileSystemViaFilesRead(String filePathString) {
        try {
            byte[] fileContent = Files.readAllBytes(Paths.get(filePathString));
        } catch (IOException e) {
            throw new RuntimeException("Error reading file: " + filePathString, e);
        }
    }

    public void accessFileSystemViaFilesWrite(String filePathString) {
        try {
            String content = "This is sample data for writing into the file.";
            Files.write(Paths.get(filePathString), content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        } catch (IOException e) {
            throw new RuntimeException("Error writing to file: " + filePathString, e);
        }
    }

    public void accessFileSystemViaFilesExecute(String filePathString) {
        try {
            Path filePath = Paths.get(filePathString);
            boolean isExecutable = Files.isExecutable(filePath);

            Files.setPosixFilePermissions(filePath, Set.of(PosixFilePermission.OWNER_EXECUTE));
        } catch (IOException e) {
            throw new RuntimeException("Error setting execute permissions on file: " + filePathString, e);
        }
    }

    public void accessFileSystemViaFilesDelete(String filePathString) {
        try {
            Files.delete(Paths.get(filePathString));
        } catch (IOException e) {
            throw new RuntimeException("Error deleting file: " + filePathString, e);
        }
    }

}
