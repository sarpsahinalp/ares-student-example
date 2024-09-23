package de.tum.cit.ase;

import de.tum.cit.ase.ares.api.Policy;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import static de.tum.cit.ase.ares.api.util.ReflectionTestUtils.*;

import de.tum.cit.ase.ares.api.BlacklistPath;
import de.tum.cit.ase.ares.api.WhitelistPath;
import de.tum.cit.ase.ares.api.jupiter.Public;
import org.opentest4j.AssertionFailedError;

/**
 * @author Stephan Krusche (krusche@in.tum.de)
 * @version 5.1 (11.06.2021)
 */
@Public
@WhitelistPath("target") // mainly for Artemis
@BlacklistPath("target/test-classes") // prevent access to test-related classes and resources
class FileSystemAccessDemoTest {

    //<editor-fold desc="ReadTests">
    @Test
    @Policy(value = "test/de/tum/cit/ase/EverythingForbiddenPolicy.yaml", withinPath = "classes/java/main")
    void accessFileSystemViaFilesReadArchUnit() {
        Class<?> clazz = getClazz("de.tum.cit.ase.FileSystemAccessDemo");
        Object fileSystemAccessDemo = newInstance(clazz);
        invokeMethod(fileSystemAccessDemo, "accessFileSystemViaFilesRead", "pom123.xml");
    }

    @Test
    @Policy(value = "test/de/tum/cit/ase/OnePathAllowedAspectJ.yaml", withinPath = "classes/java/main")
    void accessFileSystemViaFilesReadAspectJ() {
        try {
            Class<?> clazz = getClazz("de.tum.cit.ase.FileSystemAccessDemo");
            Object fileSystemAccessDemo = newInstance(clazz);
            invokeMethod(fileSystemAccessDemo, "accessFileSystemViaFilesRead", "pom123.xml");
            fail();
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    @Policy(value = "test/de/tum/cit/ase/OnePathAllowedInstrumentation.yaml", withinPath = "classes/java/main")
    void accessFileSystemViaFilesReadInstrumentation() {
        try {
            Class<?> clazz = getClazz("de.tum.cit.ase.FileSystemAccessDemo");
            Object fileSystemAccessDemo = newInstance(clazz);
            invokeMethod(fileSystemAccessDemo, "accessFileSystemViaFilesRead", "pom123.xml");
            fail();
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }
    //</editor-fold>

    //<editor-fold desc="WriteTests">
    @Test
    @Policy(value = "test/de/tum/cit/ase/EverythingForbiddenPolicy.yaml", withinPath = "classes/java/main")
    void accessFileSystemViaFilesWriteArchUnit() {
        Class<?> clazz = getClazz("de.tum.cit.ase.FileSystemAccessDemo");
        Object fileSystemAccessDemo = newInstance(clazz);
        invokeMethod(fileSystemAccessDemo, "accessFileSystemViaFilesWrite", "pom123.xml");
    }

    @Test
    @Policy(value = "test/de/tum/cit/ase/OnePathAllowedAspectJ.yaml", withinPath = "classes/java/main")
    void accessFileSystemViaFilesWriteAspectJ() {
        try {
            Class<?> clazz = getClazz("de.tum.cit.ase.FileSystemAccessDemo");
            Object fileSystemAccessDemo = newInstance(clazz);
            invokeMethod(fileSystemAccessDemo, "accessFileSystemViaFilesWrite", "pom123.xml");
            fail();
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    @Policy(value = "test/de/tum/cit/ase/OnePathAllowedInstrumentation.yaml", withinPath = "classes/java/main")
    void accessFileSystemViaFilesWriteInstrumentation() {
        try {
            Class<?> clazz = getClazz("de.tum.cit.ase.FileSystemAccessDemo");
            Object fileSystemAccessDemo = newInstance(clazz);
            invokeMethod(fileSystemAccessDemo, "accessFileSystemViaFilesWrite", "pom123.xml");
            fail();
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }
    //</editor-fold>

    //<editor-fold desc="ExecuteTests">

    @Test
    @Policy(value = "test/de/tum/cit/ase/EverythingForbiddenPolicy.yaml", withinPath = "classes/java/main")
    void accessFileSystemViaFilesExecuteArchUnit() {
        Class<?> clazz = getClazz("de.tum.cit.ase.FileSystemAccessDemo");
        Object fileSystemAccessDemo = newInstance(clazz);
        invokeMethod(fileSystemAccessDemo, "accessFileSystemViaFilesExecute", "pom123.xml");
    }

    @Test
    @Policy(value = "test/de/tum/cit/ase/OnePathAllowedAspectJ.yaml", withinPath = "classes/java/main")
    void accessFileSystemViaFilesExecuteAspectJ() {
        try {
            Class<?> clazz = getClazz("de.tum.cit.ase.FileSystemAccessDemo");
            Object fileSystemAccessDemo = newInstance(clazz);
            invokeMethod(fileSystemAccessDemo, "accessFileSystemViaFilesExecute", "pom123.xml");
            fail();
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    @Policy(value = "test/de/tum/cit/ase/OnePathAllowedInstrumentation.yaml", withinPath = "classes/java/main")
    void accessFileSystemViaFilesExecuteInstrumentation() {
        try {
            Class<?> clazz = getClazz("de.tum.cit.ase.FileSystemAccessDemo");
            Object fileSystemAccessDemo = newInstance(clazz);
            invokeMethod(fileSystemAccessDemo, "accessFileSystemViaFilesExecute", "pom123.xml");
            fail();
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }
    //</editor-fold>

    //<editor-fold desc="DeleteTests">
    @Test
    @Policy(value = "test/de/tum/cit/ase/EverythingForbiddenPolicy.yaml", withinPath = "classes/java/main")
    void accessFileSystemViaFilesDeleteArchUnit() {
        Class<?> clazz = getClazz("de.tum.cit.ase.FileSystemAccessDemo");
        Object fileSystemAccessDemo = newInstance(clazz);
        invokeMethod(fileSystemAccessDemo, "accessFileSystemViaFilesDelete", "pom123.xml");
    }

    @Test
    @Policy(value = "test/de/tum/cit/ase/OnePathAllowedAspectJ.yaml", withinPath = "classes/java/main")
    void accessFileSystemViaFilesDeleteAspectJ() {
        try {
            Class<?> clazz = getClazz("de.tum.cit.ase.FileSystemAccessDemo");
            Object fileSystemAccessDemo = newInstance(clazz);
            invokeMethod(fileSystemAccessDemo, "accessFileSystemViaFilesDelete", "pom123.xml");
            fail();
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    @Policy(value = "test/de/tum/cit/ase/OnePathAllowedInstrumentation.yaml", withinPath = "classes/java/main")
    void accessFileSystemViaFilesDeleteInstrumentation() {
        try {
            Class<?> clazz = getClazz("de.tum.cit.ase.FileSystemAccessDemo");
            Object fileSystemAccessDemo = newInstance(clazz);
            invokeMethod(fileSystemAccessDemo, "accessFileSystemViaFilesDelete", "pom123.xml");
            fail();
        } catch (AssertionFailedError e) {
            System.out.println(e.getMessage());
        }
    }
    //</editor-fold>

}
