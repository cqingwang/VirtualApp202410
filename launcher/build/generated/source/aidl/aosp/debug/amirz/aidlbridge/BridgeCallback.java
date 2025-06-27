/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Volumes/Linux/cqingwang/VirtualApp202410/launcher/src/amirz/aidlbridge/BridgeCallback.aidl
 */
package amirz.aidlbridge;
public interface BridgeCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements amirz.aidlbridge.BridgeCallback
{
private static final java.lang.String DESCRIPTOR = "amirz.aidlbridge.BridgeCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an amirz.aidlbridge.BridgeCallback interface,
 * generating a proxy if needed.
 */
public static amirz.aidlbridge.BridgeCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof amirz.aidlbridge.BridgeCallback))) {
return ((amirz.aidlbridge.BridgeCallback)iin);
}
return new amirz.aidlbridge.BridgeCallback.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
java.lang.String descriptor = DESCRIPTOR;
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(descriptor);
return true;
}
case TRANSACTION_onBridgeConnected:
{
data.enforceInterface(descriptor);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.onBridgeConnected(_arg0);
return true;
}
case TRANSACTION_onBridgeDisconnected:
{
data.enforceInterface(descriptor);
this.onBridgeDisconnected();
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements amirz.aidlbridge.BridgeCallback
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void onBridgeConnected(android.os.IBinder service) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(service);
mRemote.transact(Stub.TRANSACTION_onBridgeConnected, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onBridgeDisconnected() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onBridgeDisconnected, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onBridgeConnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onBridgeDisconnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void onBridgeConnected(android.os.IBinder service) throws android.os.RemoteException;
public void onBridgeDisconnected() throws android.os.RemoteException;
}
