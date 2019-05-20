// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cusparse;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.cusparse.*;

@Opaque @Properties(inherit = org.bytedeco.cuda.presets.cusparse.class)
public class cusparseSpMatDescr extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cusparseSpMatDescr() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cusparseSpMatDescr(Pointer p) { super(p); }
}
