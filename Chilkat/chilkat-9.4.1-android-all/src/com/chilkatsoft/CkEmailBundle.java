/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkEmailBundle {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CkEmailBundle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CkEmailBundle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkEmailBundle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkEmailBundle() {
    this(chilkatJNI.new_CkEmailBundle(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkEmailBundle_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkEmailBundle_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkEmailBundle_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkEmailBundle_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkEmailBundle_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkEmailBundle_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkEmailBundle_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkEmailBundle_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkEmailBundle_lastErrorXml(swigCPtr, this);
  }

  public int get_MessageCount() {
    return chilkatJNI.CkEmailBundle_get_MessageCount(swigCPtr, this);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkEmailBundle_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkEmailBundle_version(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkEmailBundle_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkEmailBundle_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkEmailBundle_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkEmailBundle_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkEmailBundle_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public boolean AddEmail(CkEmail email) {
    return chilkatJNI.CkEmailBundle_AddEmail(swigCPtr, this, CkEmail.getCPtr(email), email);
  }

  public CkEmail FindByHeader(String name, String value) {
    long cPtr = chilkatJNI.CkEmailBundle_FindByHeader(swigCPtr, this, name, value);
    return (cPtr == 0) ? null : new CkEmail(cPtr, true);
  }

  public CkEmail GetEmail(int index) {
    long cPtr = chilkatJNI.CkEmailBundle_GetEmail(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CkEmail(cPtr, true);
  }

  public CkStringArray GetUidls() {
    long cPtr = chilkatJNI.CkEmailBundle_GetUidls(swigCPtr, this);
    return (cPtr == 0) ? null : new CkStringArray(cPtr, true);
  }

  public boolean GetXml(CkString outXml) {
    return chilkatJNI.CkEmailBundle_GetXml(swigCPtr, this, CkString.getCPtr(outXml), outXml);
  }

  public String getXml() {
    return chilkatJNI.CkEmailBundle_getXml(swigCPtr, this);
  }

  public String xml() {
    return chilkatJNI.CkEmailBundle_xml(swigCPtr, this);
  }

  public boolean LoadXml(String path) {
    return chilkatJNI.CkEmailBundle_LoadXml(swigCPtr, this, path);
  }

  public boolean LoadXmlString(String xmlStr) {
    return chilkatJNI.CkEmailBundle_LoadXmlString(swigCPtr, this, xmlStr);
  }

  public boolean RemoveEmail(CkEmail email) {
    return chilkatJNI.CkEmailBundle_RemoveEmail(swigCPtr, this, CkEmail.getCPtr(email), email);
  }

  public boolean RemoveEmailByIndex(int index) {
    return chilkatJNI.CkEmailBundle_RemoveEmailByIndex(swigCPtr, this, index);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkEmailBundle_SaveLastError(swigCPtr, this, path);
  }

  public boolean SaveXml(String path) {
    return chilkatJNI.CkEmailBundle_SaveXml(swigCPtr, this, path);
  }

  public void SortByDate(boolean ascending) {
    chilkatJNI.CkEmailBundle_SortByDate(swigCPtr, this, ascending);
  }

  public void SortByRecipient(boolean ascending) {
    chilkatJNI.CkEmailBundle_SortByRecipient(swigCPtr, this, ascending);
  }

  public void SortBySender(boolean ascending) {
    chilkatJNI.CkEmailBundle_SortBySender(swigCPtr, this, ascending);
  }

  public void SortBySubject(boolean ascending) {
    chilkatJNI.CkEmailBundle_SortBySubject(swigCPtr, this, ascending);
  }

}
