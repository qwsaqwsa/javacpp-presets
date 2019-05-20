// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/**
 * Structure to store GRID licensable features
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlGridLicensableFeatures_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlGridLicensableFeatures_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlGridLicensableFeatures_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlGridLicensableFeatures_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlGridLicensableFeatures_t position(long position) {
        return (nvmlGridLicensableFeatures_t)super.position(position);
    }

    /** Non-zero if GRID Software Licensing is supported on the system, otherwise zero */
    public native int isGridLicenseSupported(); public native nvmlGridLicensableFeatures_t isGridLicenseSupported(int setter);
    /** Entries returned in \a gridLicensableFeatures array */
    public native @Cast("unsigned int") int licensableFeaturesCount(); public native nvmlGridLicensableFeatures_t licensableFeaturesCount(int setter);
    /** Array of GRID licensable features. */
    public native @ByRef nvmlGridLicensableFeature_t gridLicensableFeatures(int i); public native nvmlGridLicensableFeatures_t gridLicensableFeatures(int i, nvmlGridLicensableFeature_t setter);
    @MemberGetter public native nvmlGridLicensableFeature_t gridLicensableFeatures();
}
