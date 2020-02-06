/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkMht {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CkMht(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CkMht obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkMht(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkMht() {
    this(chilkatJNI.new_CkMht(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkMht_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkMht_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkMht_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_BaseUrl(CkString str) {
    chilkatJNI.CkMht_get_BaseUrl(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String baseUrl() {
    return chilkatJNI.CkMht_baseUrl(swigCPtr, this);
  }

  public void put_BaseUrl(String newVal) {
    chilkatJNI.CkMht_put_BaseUrl(swigCPtr, this, newVal);
  }

  public int get_ConnectTimeout() {
    return chilkatJNI.CkMht_get_ConnectTimeout(swigCPtr, this);
  }

  public void put_ConnectTimeout(int newVal) {
    chilkatJNI.CkMht_put_ConnectTimeout(swigCPtr, this, newVal);
  }

  public void get_DebugHtmlAfter(CkString str) {
    chilkatJNI.CkMht_get_DebugHtmlAfter(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugHtmlAfter() {
    return chilkatJNI.CkMht_debugHtmlAfter(swigCPtr, this);
  }

  public void put_DebugHtmlAfter(String newVal) {
    chilkatJNI.CkMht_put_DebugHtmlAfter(swigCPtr, this, newVal);
  }

  public void get_DebugHtmlBefore(CkString str) {
    chilkatJNI.CkMht_get_DebugHtmlBefore(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugHtmlBefore() {
    return chilkatJNI.CkMht_debugHtmlBefore(swigCPtr, this);
  }

  public void put_DebugHtmlBefore(String newVal) {
    chilkatJNI.CkMht_put_DebugHtmlBefore(swigCPtr, this, newVal);
  }

  public boolean get_DebugTagCleaning() {
    return chilkatJNI.CkMht_get_DebugTagCleaning(swigCPtr, this);
  }

  public void put_DebugTagCleaning(boolean newVal) {
    chilkatJNI.CkMht_put_DebugTagCleaning(swigCPtr, this, newVal);
  }

  public boolean get_EmbedImages() {
    return chilkatJNI.CkMht_get_EmbedImages(swigCPtr, this);
  }

  public void put_EmbedImages(boolean newVal) {
    chilkatJNI.CkMht_put_EmbedImages(swigCPtr, this, newVal);
  }

  public boolean get_EmbedLocalOnly() {
    return chilkatJNI.CkMht_get_EmbedLocalOnly(swigCPtr, this);
  }

  public void put_EmbedLocalOnly(boolean newVal) {
    chilkatJNI.CkMht_put_EmbedLocalOnly(swigCPtr, this, newVal);
  }

  public boolean get_FetchFromCache() {
    return chilkatJNI.CkMht_get_FetchFromCache(swigCPtr, this);
  }

  public void put_FetchFromCache(boolean newVal) {
    chilkatJNI.CkMht_put_FetchFromCache(swigCPtr, this, newVal);
  }

  public int get_HeartbeatMs() {
    return chilkatJNI.CkMht_get_HeartbeatMs(swigCPtr, this);
  }

  public void put_HeartbeatMs(int newVal) {
    chilkatJNI.CkMht_put_HeartbeatMs(swigCPtr, this, newVal);
  }

  public boolean get_IgnoreMustRevalidate() {
    return chilkatJNI.CkMht_get_IgnoreMustRevalidate(swigCPtr, this);
  }

  public void put_IgnoreMustRevalidate(boolean newVal) {
    chilkatJNI.CkMht_put_IgnoreMustRevalidate(swigCPtr, this, newVal);
  }

  public boolean get_IgnoreNoCache() {
    return chilkatJNI.CkMht_get_IgnoreNoCache(swigCPtr, this);
  }

  public void put_IgnoreNoCache(boolean newVal) {
    chilkatJNI.CkMht_put_IgnoreNoCache(swigCPtr, this, newVal);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkMht_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkMht_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkMht_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkMht_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkMht_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkMht_lastErrorXml(swigCPtr, this);
  }

  public boolean get_NoScripts() {
    return chilkatJNI.CkMht_get_NoScripts(swigCPtr, this);
  }

  public void put_NoScripts(boolean newVal) {
    chilkatJNI.CkMht_put_NoScripts(swigCPtr, this, newVal);
  }

  public boolean get_NtlmAuth() {
    return chilkatJNI.CkMht_get_NtlmAuth(swigCPtr, this);
  }

  public void put_NtlmAuth(boolean newVal) {
    chilkatJNI.CkMht_put_NtlmAuth(swigCPtr, this, newVal);
  }

  public int get_NumCacheLevels() {
    return chilkatJNI.CkMht_get_NumCacheLevels(swigCPtr, this);
  }

  public void put_NumCacheLevels(int newVal) {
    chilkatJNI.CkMht_put_NumCacheLevels(swigCPtr, this, newVal);
  }

  public int get_NumCacheRoots() {
    return chilkatJNI.CkMht_get_NumCacheRoots(swigCPtr, this);
  }

  public boolean get_PreferMHTScripts() {
    return chilkatJNI.CkMht_get_PreferMHTScripts(swigCPtr, this);
  }

  public void put_PreferMHTScripts(boolean newVal) {
    chilkatJNI.CkMht_put_PreferMHTScripts(swigCPtr, this, newVal);
  }

  public void get_Proxy(CkString str) {
    chilkatJNI.CkMht_get_Proxy(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String proxy() {
    return chilkatJNI.CkMht_proxy(swigCPtr, this);
  }

  public void put_Proxy(String newVal) {
    chilkatJNI.CkMht_put_Proxy(swigCPtr, this, newVal);
  }

  public void get_ProxyLogin(CkString str) {
    chilkatJNI.CkMht_get_ProxyLogin(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String proxyLogin() {
    return chilkatJNI.CkMht_proxyLogin(swigCPtr, this);
  }

  public void put_ProxyLogin(String newVal) {
    chilkatJNI.CkMht_put_ProxyLogin(swigCPtr, this, newVal);
  }

  public void get_ProxyPassword(CkString str) {
    chilkatJNI.CkMht_get_ProxyPassword(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String proxyPassword() {
    return chilkatJNI.CkMht_proxyPassword(swigCPtr, this);
  }

  public void put_ProxyPassword(String newVal) {
    chilkatJNI.CkMht_put_ProxyPassword(swigCPtr, this, newVal);
  }

  public int get_ReadTimeout() {
    return chilkatJNI.CkMht_get_ReadTimeout(swigCPtr, this);
  }

  public void put_ReadTimeout(int newVal) {
    chilkatJNI.CkMht_put_ReadTimeout(swigCPtr, this, newVal);
  }

  public void get_SocksHostname(CkString str) {
    chilkatJNI.CkMht_get_SocksHostname(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String socksHostname() {
    return chilkatJNI.CkMht_socksHostname(swigCPtr, this);
  }

  public void put_SocksHostname(String newVal) {
    chilkatJNI.CkMht_put_SocksHostname(swigCPtr, this, newVal);
  }

  public void get_SocksPassword(CkString str) {
    chilkatJNI.CkMht_get_SocksPassword(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String socksPassword() {
    return chilkatJNI.CkMht_socksPassword(swigCPtr, this);
  }

  public void put_SocksPassword(String newVal) {
    chilkatJNI.CkMht_put_SocksPassword(swigCPtr, this, newVal);
  }

  public int get_SocksPort() {
    return chilkatJNI.CkMht_get_SocksPort(swigCPtr, this);
  }

  public void put_SocksPort(int newVal) {
    chilkatJNI.CkMht_put_SocksPort(swigCPtr, this, newVal);
  }

  public void get_SocksUsername(CkString str) {
    chilkatJNI.CkMht_get_SocksUsername(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String socksUsername() {
    return chilkatJNI.CkMht_socksUsername(swigCPtr, this);
  }

  public void put_SocksUsername(String newVal) {
    chilkatJNI.CkMht_put_SocksUsername(swigCPtr, this, newVal);
  }

  public int get_SocksVersion() {
    return chilkatJNI.CkMht_get_SocksVersion(swigCPtr, this);
  }

  public void put_SocksVersion(int newVal) {
    chilkatJNI.CkMht_put_SocksVersion(swigCPtr, this, newVal);
  }

  public boolean get_UnpackUseRelPaths() {
    return chilkatJNI.CkMht_get_UnpackUseRelPaths(swigCPtr, this);
  }

  public void put_UnpackUseRelPaths(boolean newVal) {
    chilkatJNI.CkMht_put_UnpackUseRelPaths(swigCPtr, this, newVal);
  }

  public boolean get_UpdateCache() {
    return chilkatJNI.CkMht_get_UpdateCache(swigCPtr, this);
  }

  public void put_UpdateCache(boolean newVal) {
    chilkatJNI.CkMht_put_UpdateCache(swigCPtr, this, newVal);
  }

  public boolean get_UseCids() {
    return chilkatJNI.CkMht_get_UseCids(swigCPtr, this);
  }

  public void put_UseCids(boolean newVal) {
    chilkatJNI.CkMht_put_UseCids(swigCPtr, this, newVal);
  }

  public boolean get_UseFilename() {
    return chilkatJNI.CkMht_get_UseFilename(swigCPtr, this);
  }

  public void put_UseFilename(boolean newVal) {
    chilkatJNI.CkMht_put_UseFilename(swigCPtr, this, newVal);
  }

  public boolean get_UseIEProxy() {
    return chilkatJNI.CkMht_get_UseIEProxy(swigCPtr, this);
  }

  public void put_UseIEProxy(boolean newVal) {
    chilkatJNI.CkMht_put_UseIEProxy(swigCPtr, this, newVal);
  }

  public boolean get_UseInline() {
    return chilkatJNI.CkMht_get_UseInline(swigCPtr, this);
  }

  public void put_UseInline(boolean newVal) {
    chilkatJNI.CkMht_put_UseInline(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkMht_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkMht_version(swigCPtr, this);
  }

  public void get_WebSiteLogin(CkString str) {
    chilkatJNI.CkMht_get_WebSiteLogin(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String webSiteLogin() {
    return chilkatJNI.CkMht_webSiteLogin(swigCPtr, this);
  }

  public void put_WebSiteLogin(String newVal) {
    chilkatJNI.CkMht_put_WebSiteLogin(swigCPtr, this, newVal);
  }

  public void get_WebSiteLoginDomain(CkString str) {
    chilkatJNI.CkMht_get_WebSiteLoginDomain(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String webSiteLoginDomain() {
    return chilkatJNI.CkMht_webSiteLoginDomain(swigCPtr, this);
  }

  public void put_WebSiteLoginDomain(String newVal) {
    chilkatJNI.CkMht_put_WebSiteLoginDomain(swigCPtr, this, newVal);
  }

  public void get_WebSitePassword(CkString str) {
    chilkatJNI.CkMht_get_WebSitePassword(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String webSitePassword() {
    return chilkatJNI.CkMht_webSitePassword(swigCPtr, this);
  }

  public void put_WebSitePassword(String newVal) {
    chilkatJNI.CkMht_put_WebSitePassword(swigCPtr, this, newVal);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkMht_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkMht_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkMht_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkMht_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkMht_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void AddCacheRoot(String dir) {
    chilkatJNI.CkMht_AddCacheRoot(swigCPtr, this, dir);
  }

  public void AddCustomHeader(String name, String value) {
    chilkatJNI.CkMht_AddCustomHeader(swigCPtr, this, name, value);
  }

  public void AddExternalStyleSheet(String url) {
    chilkatJNI.CkMht_AddExternalStyleSheet(swigCPtr, this, url);
  }

  public void ClearCustomHeaders() {
    chilkatJNI.CkMht_ClearCustomHeaders(swigCPtr, this);
  }

  public void ExcludeImagesMatching(String pattern) {
    chilkatJNI.CkMht_ExcludeImagesMatching(swigCPtr, this, pattern);
  }

  public boolean GetAndSaveEML(String url, String emlPath) {
    return chilkatJNI.CkMht_GetAndSaveEML(swigCPtr, this, url, emlPath);
  }

  public boolean GetAndSaveMHT(String url, String mhtPath) {
    return chilkatJNI.CkMht_GetAndSaveMHT(swigCPtr, this, url, mhtPath);
  }

  public boolean GetAndZipEML(String url, String zipEntryFilename, String zipPath) {
    return chilkatJNI.CkMht_GetAndZipEML(swigCPtr, this, url, zipEntryFilename, zipPath);
  }

  public boolean GetAndZipMHT(String url, String zipEntryFilename, String zipPath) {
    return chilkatJNI.CkMht_GetAndZipMHT(swigCPtr, this, url, zipEntryFilename, zipPath);
  }

  public boolean GetCacheRoot(int index, CkString outStr) {
    return chilkatJNI.CkMht_GetCacheRoot(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getCacheRoot(int index) {
    return chilkatJNI.CkMht_getCacheRoot(swigCPtr, this, index);
  }

  public String cacheRoot(int index) {
    return chilkatJNI.CkMht_cacheRoot(swigCPtr, this, index);
  }

  public boolean GetEML(String url, CkString outStr) {
    return chilkatJNI.CkMht_GetEML(swigCPtr, this, url, CkString.getCPtr(outStr), outStr);
  }

  public String getEML(String url) {
    return chilkatJNI.CkMht_getEML(swigCPtr, this, url);
  }

  public String eML(String url) {
    return chilkatJNI.CkMht_eML(swigCPtr, this, url);
  }

  public CkEmail GetEmail(String url) {
    long cPtr = chilkatJNI.CkMht_GetEmail(swigCPtr, this, url);
    return (cPtr == 0) ? null : new CkEmail(cPtr, true);
  }

  public boolean GetMHT(String url, CkString outStr) {
    return chilkatJNI.CkMht_GetMHT(swigCPtr, this, url, CkString.getCPtr(outStr), outStr);
  }

  public String getMHT(String url) {
    return chilkatJNI.CkMht_getMHT(swigCPtr, this, url);
  }

  public String mHT(String url) {
    return chilkatJNI.CkMht_mHT(swigCPtr, this, url);
  }

  public CkMime GetMime(String url) {
    long cPtr = chilkatJNI.CkMht_GetMime(swigCPtr, this, url);
    return (cPtr == 0) ? null : new CkMime(cPtr, true);
  }

  public boolean HtmlToEML(String htmlText, CkString outStr) {
    return chilkatJNI.CkMht_HtmlToEML(swigCPtr, this, htmlText, CkString.getCPtr(outStr), outStr);
  }

  public String htmlToEML(String htmlText) {
    return chilkatJNI.CkMht_htmlToEML(swigCPtr, this, htmlText);
  }

  public boolean HtmlToEMLFile(String html, String emlPath) {
    return chilkatJNI.CkMht_HtmlToEMLFile(swigCPtr, this, html, emlPath);
  }

  public CkEmail HtmlToEmail(String htmlText) {
    long cPtr = chilkatJNI.CkMht_HtmlToEmail(swigCPtr, this, htmlText);
    return (cPtr == 0) ? null : new CkEmail(cPtr, true);
  }

  public boolean HtmlToMHT(String htmlText, CkString outStr) {
    return chilkatJNI.CkMht_HtmlToMHT(swigCPtr, this, htmlText, CkString.getCPtr(outStr), outStr);
  }

  public String htmlToMHT(String htmlText) {
    return chilkatJNI.CkMht_htmlToMHT(swigCPtr, this, htmlText);
  }

  public boolean HtmlToMHTFile(String html, String mhtPath) {
    return chilkatJNI.CkMht_HtmlToMHTFile(swigCPtr, this, html, mhtPath);
  }

  public boolean IsUnlocked() {
    return chilkatJNI.CkMht_IsUnlocked(swigCPtr, this);
  }

  public void RemoveCustomHeader(String name) {
    chilkatJNI.CkMht_RemoveCustomHeader(swigCPtr, this, name);
  }

  public void RestoreDefaults() {
    chilkatJNI.CkMht_RestoreDefaults(swigCPtr, this);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkMht_SaveLastError(swigCPtr, this, path);
  }

  public boolean UnlockComponent(String unlockCode) {
    return chilkatJNI.CkMht_UnlockComponent(swigCPtr, this, unlockCode);
  }

  public boolean UnpackMHT(String mhtPath, String unpackDir, String htmlFilename, String partsSubDir) {
    return chilkatJNI.CkMht_UnpackMHT(swigCPtr, this, mhtPath, unpackDir, htmlFilename, partsSubDir);
  }

  public boolean UnpackMHTString(String mhtContents, String unpackDir, String htmlFilename, String partsSubDir) {
    return chilkatJNI.CkMht_UnpackMHTString(swigCPtr, this, mhtContents, unpackDir, htmlFilename, partsSubDir);
  }

}
