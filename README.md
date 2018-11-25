# BelajarRajaAPI
Ini file hasil belajar kotlin MVP patern dengan RAJA API

# Raja API Doc
<https://docs.rajaapi.com/dokumentasi/wilayah>

# Setting API
Tambahkan baris code berikut ini pada file ```build.gradle(Module:app)``` sesuaikan token yang anda dapat dengan melakukan request ```GET https://x.rajaapi.com/poe``` pada saat pembuatan aplikasi ini token yang saya peroleh adalah ```hxynMSzhyubkN42Kw85wdxty9LmSNYjnn4ybn0ZXAK9aLw7I7D``` tambahkan kode token pada ```RAJA_API_KEY``` pada file ```build.gradle(Module:app)```

```java
  buildConfigField "String", "BASE_URL", "\"https://x.rajaapi.com/MeP7c5ne\""
  buildConfigField "String", "RAJA_API_KEY", "\"hxynMSzhyubkN42Kw85wdxty9LmSNYjnn4ybn0ZXAK9aLw7I7D\""
```

