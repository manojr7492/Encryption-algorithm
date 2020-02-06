/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkMessageSet {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CkMessageSet(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CkMessageSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkMessageSet(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkMessageSet() {
    this(chilkatJNI.new_CkMessageSet(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkMessageSet_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkMessageSet_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkMessageSet_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public int get_Count() {
    return chilkatJNI.CkMessageSet_get_Count(swigCPtr, this);
  }

  public boolean get_HasUids() {
    return chilkatJNI.CkMessageSet_get_HasUids(swigCPtr, this);
  }

  public void put_HasUids(boolean newVal) {
    chilkatJNI.CkMessageSet_put_HasUids(swigCPtr, this, newVal);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkMessageSet_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkMessageSet_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkMessageSet_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkMessageSet_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkMessageSet_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkMessageSet_lastErrorXml(swigCPtr, this);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkMessageSet_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkMessageSet_version(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkMessageSet_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkMessageSet_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkMessageSet_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkMessageSet_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkMessageSet_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public boolean ContainsId(int id) {
    return chilkatJNI.CkMessageSet_ContainsId(swigCPtr, this, id);
  }

  public boolean FromCompactString(String str) {
    return chilkatJNI.CkMessageSet_FromCompactString(swigCPtr, this, str);
  }

  public int GetId(int index) {
    return chilkatJNI.CkMessageSet_GetId(swigCPtr, this, index);
  }

  public void InsertId(int id) {
    chilkatJNI.CkMessageSet_InsertId(swigCPtr, this, id);
  }

  public void RemoveId(int id) {
    chilkatJNI.CkMessageSet_RemoveId(swigCPtr, this, id);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkMessageSet_SaveLastError(swigCPtr, this, path);
  }

  public boolean ToCompactString(CkString outStr) {
    return chilkatJNI.CkMessageSet_ToCompactString(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String toCompactString() {
    return chilkatJNI.CkMessageSet_toCompactString(swigCPtr, this);
  }

  public boolean ToString(CkString outStr) {
    return chilkatJNI.CkMessageSet_ToString(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String toString() {
    return chilkatJNI.CkMessageSet_toString(swigCPtr, this);
  }

}
