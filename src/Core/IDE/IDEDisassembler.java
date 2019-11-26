/*
 * IDE-Triangle v1.0
 * IDEDisassembler.java
 */

package Core.IDE;

/**
 * Just a small class to call the Triangle disassembler.
 *
 * @author Luis Leopoldo Perez <luiperpe@ns.isi.ulatina.ac.cr>
 */
public class IDEDisassembler {
    
    // <editor-fold defaultstate="collapsed" desc=" Methods ">    
    /**
     * Creates a new instance of IDEDisassembler.
     */
    public IDEDisassembler() {
    }
    
    /**
     * Runs the triangle disassembler static method as a separate thread.
     * @param fileName Path to the TAM Object file.
     */
    public void Disassemble(final String fileName) {
        new Thread(() -> {
			TAM.Disassembler.main(new String[] {fileName});
		}).start();
    }
    // </editor-fold>    
}
