/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Volumes/Linux/cqingwang/VirtualApp202410/launcher/src/amirz/aidlbridge/Bridge.aidl
 */
package amirz.aidlbridge;
public interface Bridge extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements amirz.aidlbridge.Bridge
{
private static final java.lang.String DESCRIPTOR = "amirz.aidlbridge.Bridge";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an amirz.aidlbridge.Bridge interface,
 * generating a proxy if needed.
 */
public static amirz.aidlbridge.Bridge asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof amirz.aidlbridge.Bridge))) {
return ((amirz.aidlbridge.Bridge)iin);
}
return new amirz.aidlbridge.Bridge.Stub.Proxy(obj);
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
case TRANSACTION_setCallback:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
amirz.aidlbridge.BridgeCallback _arg1;
_arg1 = amirz.aidlbridge.BridgeCallback.Stub.asInterface(data.readStrongBinder());
this.setCallback(_arg0, _arg1);
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements amirz.aidlbridge.Bridge
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
@Override public void setCallback(int index, amirz.aidlbridge.BridgeCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(index);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setCallback, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_setCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void setCallback(int index, amirz.aidlbridge.BridgeCallback cb) throws android.os.RemoteException;
}
