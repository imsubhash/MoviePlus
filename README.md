# MoviePlus :clapper:

<p align="center"> 
	<img src="https://github-production-user-asset-6210df.s3.amazonaws.com/64840495/261942444-efb2061d-c21d-4348-ab19-9c48837b11e8.png" alt="MoviePlus"/> 
</p>

<br><br>

MoviePlus is a modern Android application that enables users to discover and explore a vast collection of movies using cutting-edge technologies and industry best practices. This README provides an overview of the app's features and the technologies powering it.

<br><br>


## Features :sparkles:

MoviePlus delivers an exceptional movie browsing experience with these key features:

:small_orange_diamond: **Smart Pagination** with [Paging 3 Library](https://developer.android.com/topic/libraries/architecture/paging/v3-overview)  
Efficiently loads and displays movie data with smooth scrolling and optimal memory management

:small_orange_diamond: **Clean Architecture** with [MVVM Pattern](https://developer.android.com/topic/libraries/architecture/viewmodel)  
Promotes maintainability and testability through clear separation of concerns

:small_orange_diamond: **Dependency Injection** with [Hilt](https://dagger.dev/hilt/)  
Simplifies dependency management and enables modular development

:small_orange_diamond: **Network Operations** with [Retrofit](https://square.github.io/retrofit/)  
Handles all API communications with The Movie Database (TMDb) efficiently

:small_orange_diamond: **Reactive Programming** with [Kotlin Flow](https://developer.android.com/kotlin/flow)  
Delivers real-time data updates to the UI for a responsive experience

:small_orange_diamond: **Local Storage** with [Room Database](https://developer.android.com/training/data-storage/room)  
Caches movie data for offline access and faster loading

:small_orange_diamond: **Image Loading** with [Glide](https://github.com/bumptech/glide)  
Provides smooth image loading and caching for movie posters

## Getting Started :rocket:

Follow these steps to set up MoviePlus locally:

1️⃣ Clone the repository:
```bash
git clone https://github.com/imsubhash/MoviePlus.git
```

2️⃣ Open the project in Android Studio

3️⃣ Obtain an API key from [The Movie Database (TMDb)](https://www.themoviedb.org/)

4️⃣ Add your API key to `local.properties`:
```
API_KEY=your_api_key_here
TOKEN=Bearer
```

5️⃣ Build and run the app on an emulator or physical device

<img src="https://github.com/user-attachments/assets/f9554a35-d6f5-4d68-871b-a7fe68791c1b" height="700">
&nbsp;
<img src="https://github.com/user-attachments/assets/8a07b616-7f24-4ac1-b19b-06b0f954f8e8" height="700">
&nbsp;
<img src="https://github.com/user-attachments/assets/3fae05d5-48c0-4ad0-a42c-2e352fcef7e5" height="700">
&nbsp;
<img src="https://github.com/user-attachments/assets/79e7a85c-a78d-47da-a2cb-17b45ebc82de" height="700">
&nbsp;


## Project Structure :file_folder:

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/yourpackage/
│   │   │   ├── data/       # Data layer components
│   │   │   ├── di/         # Dependency injection
│   │   │   ├── ui/         # Presentation layer
│   │   │   └── utils/      # Utility classes
│   │   └── res/            # Resources
├── build.gradle.kts         # Module-level build config
```

## Contributing :handshake:

We welcome contributions! Please fork the repository and create a pull request with your changes.

## Contact :email:

For questions or feedback, please contact us at:
- Email: skumar.iiita@gmail.com
- GitHub Issues: [Open an issue](https://github.com/imsubhash/MoviePlus/issues)

Enjoy exploring movies with MoviePlus! :popcorn:
