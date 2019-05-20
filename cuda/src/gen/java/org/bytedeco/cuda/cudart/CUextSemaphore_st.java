// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;

/** CUDA external semaphore */
@Opaque @Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUextSemaphore_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CUextSemaphore_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUextSemaphore_st(Pointer p) { super(p); }
}
