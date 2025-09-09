This Branch is for show a inconsistency between different version of Android.
The provided code initial commit provided the following 
<img width="480" height="653" alt="Screenshot from 2025-09-09 19-59-54" src="https://github.com/user-attachments/assets/3d870570-3fa2-4bf0-8eb5-6b7b657b497b" />
Although having clipChildren and ClipToOutline set, the child under the parent (grey rounded background) can exists outside of the parent.
The problem lays on the usage of
    <corners
        android:bottomLeftRadius="200dp"
        android:bottomRightRadius="200dp"
        android:topLeftRadius="200dp"
        android:topRightRadius="200dp"/>
For some reason, (i did not drill deep down in the code of it since it is fixed) this will cause the child clipping failed in the older version of Android
As far as i have tested, Android 12 API levels 31 will have this problem. For Android 15 API level 35 this problem will not exist.
Just in case you are confused, the compileSdk does not mean this app will run on API level 35. It actually depends on the min (device Android version, compileVersion)
Changing to 
    <corners android:radius="200dp" />
should produce the following correct result.
<img width="480" height="653" alt="Screenshot from 2025-09-09 20-27-44" src="https://github.com/user-attachments/assets/ae530ad9-828c-4c97-bd30-057fb565fb45" />

Side Note: I know the jetpack compose is the what you should use now and people are way away from the Android 12, but i just think it will be great to have some of the bug/problem documented to let other suffer less. I encounter this problem
multiple times and find little answer to this one. I remember one stackOverflow mentioned this, but it came along with multiple solution together and was not precise enough and i missed it. 
