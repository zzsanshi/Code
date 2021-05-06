import org.objectweb.asm.*;

import java.io.IOException;
import java.io.InputStream;

import static org.objectweb.asm.Opcodes.ASM4;
import java.lang.Runnable;

public class TestASM {
    private int num1 = 1;
    public static int NUM1 = 100;
    public int func(int a,int b){
        return add(a,b);
    }
    public int add(int a,int b) {
        return a+b+num1;
    }
    public int sub(int a, int b) {
        return a-b-NUM1;
    }

    public static void main(String[] args) throws IOException {

        ClassPrinter cp = new ClassPrinter();
        ClassReader cr = new ClassReader("java.lang.Runnable");
        cr.accept(cp, 0);

    }
}
class ClassPrinter extends ClassVisitor {

    public ClassPrinter() {
        super(ASM4);
    }
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        System.out.println(name + " extends " + superName + " {");
    }
    public void visitSource(String source, String debug) {}
    public void visitOuterClass(String owner, String name, String desc) {}
    public AnnotationVisitor visitAnnotation(String desc, boolean visible) {
        return null;
    }
    public void visitAttribute(Attribute attr) {}
    public void visitInnerClass(String name, String outerName, String innerName, int access) {}
    public FieldVisitor visitField(int access, String name, String desc, String signature, Object value) {
        System.out.println("    " + desc + " " + name);
        return null;
    }
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        System.out.println(" " + name + desc);
        return null;
    }
    public void visitEnd() {
        System.out.println("}");
    }
}

