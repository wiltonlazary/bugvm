#!/bin/bash
cd jni
ant -f build-ios32.xml
cd ..

#curl https://codeload.github.com/kstenerud/ObjectAL-for-iPhone/legacy.tar.gz/master -o objectal.tar.gz
mkdir ObjectAL
tar xvfz objectal.tar.gz --strip-components=1 -C ObjectAL
cd ObjectAL/ObjectAL
xcodebuild -arch armv7 -sdk iphoneos IPHONEOS_DEPLOYMENT_TARGET=6.1.6
cp build/Release-iphoneos/libObjectAl.a build/libObjectAl.a.armv7
xcodebuild -arch arm64 -sdk iphoneos IPHONEOS_DEPLOYMENT_TARGET=6.1.6
cp build/Release-iphoneos/libObjectAl.a build/libObjectAl.a.arm64
xcodebuild -arch i386 -sdk iphonesimulator IPHONEOS_DEPLOYMENT_TARGET=6.1.6
cp build/Release-iphonesimulator/libObjectAl.a build/libObjectAl.a.i386
xcodebuild -arch x86_64 -sdk iphonesimulator IPHONEOS_DEPLOYMENT_TARGET=6.1.6
cp build/Release-iphonesimulator/libObjectAl.a build/libObjectAl.a.x86_64
lipo build/libObjectAL.a.armv7 build/libObjectAL.a.arm64 build/libObjectAL.a.i386 build/libObjectAL.a.x86_64 -create -output build/libObjectAL.a
cp build/libObjectAL.a ../../src/main/resources/META-INF/bugvm/ios/libs
cd ../..
cp libs/ios32/libgdx.a src/main/resources/META-INF/bugvm/ios/libs
#rm objectal.tar.gz
rm -rf ObjectAL
