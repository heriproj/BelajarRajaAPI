# BelajarRajaAPI
Ini file hasil belajar kotlin MVP patern dengan RAJA API untuk mengambil data Provinsi

# Raja API Doc
<https://docs.rajaapi.com/dokumentasi/wilayah>

# Setting API
Tambahkan baris code berikut ini pada file ```build.gradle(Module:app)``` sesuaikan token yang anda dapat dengan melakukan request ```GET https://x.rajaapi.com/poe``` pada saat pembuatan aplikasi ini token yang saya peroleh adalah ```hxynMSzhyubkN42Kw85wdxty9LmSNYjnn4ybn0ZXAK9aLw7I7D``` tambahkan kode token pada ```RAJA_API_KEY``` pada file ```build.gradle(Module:app)``` untuk token ada batas waktu 24jam ^_^. jadi kalo tokennya error generate lagi ya, buat belajar saja .. hehehe

```java
  buildConfigField "String", "BASE_URL", "\"https://x.rajaapi.com/MeP7c5ne\""
  buildConfigField "String", "RAJA_API_KEY", "\"hxynMSzhyubkN42Kw85wdxty9LmSNYjnn4ybn0ZXAK9aLw7I7D\""
```

#ScreenShoot App

<img src="https://res.cloudinary.com/alhanifdev/image/upload/v1543150197/device-2018-11-25-194902_rvvtf7.png" width="250"> <img src="https://res.cloudinary.com/alhanifdev/image/upload/v1543150197/device-2018-11-25-194932_bgjifj.png" width="250">


