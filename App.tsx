import React, {useEffect, useState} from 'react';
import {NativeModules, Text, View} from 'react-native';

const {MyNativeModule} = NativeModules;
declare module 'react-native' {
  interface NativeModulesStatic {
    MyNativeModule: {
      getString(callback: (result: string) => void): void;
    };
  }
}

const App = () => {
  const [nativeString, setNativeString] = useState('');

  useEffect(() => {
    MyNativeModule.getString(result => {
      setNativeString(result);
    });
  }, []);

  return (
    <View style={{flex: 1, justifyContent: 'center', alignItems: 'center'}}>
      <Text>RECEBEU: {nativeString}</Text>
    </View>
  );
};

export default App;
