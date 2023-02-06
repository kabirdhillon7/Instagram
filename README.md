# Instagram
Instagram is an Android photo sharing app similar to Instagram but using Parse as its backend.

## Table of Contents
- [Description](#description)
- [Demo](#demo)
- [Installation](#installation)
- [Dependencies](#dependencies)
- [License](#license)


### Description
Some of the main features include:

The following **required** functionality is completed:
- [x] User can sign up to create a new account using Parse authentication.
- [x] User can log in and log out of his or her account.
- [x] The current signed in user is persisted across app restarts.
- [x] User can take a photo, add a caption, and post it to "Instagram".
- [x] User can view the last 20 posts submitted to "Instagram".
- [x] The user should switch between different tabs - viewing all posts (feed view), compose (capture photos form camera) and profile tabs (posts made) using fragments and a Bottom Navigation View. (2 points)
- [x] User can pull to refresh the last 20 posts submitted to "Instagram".
- [x] User sees app icon in home screen and styled bottom navigation view
- [x] Style the feed to look like the real Instagram feed.

### Demo
#### Current Progress Walkthrough

<img src="https://github.com/kabirdhillon7/Instagram/blob/master/Walkthrough%202.gif" width=250><br>

#### Progress 1 Walkthrough
<details>
  <img src="https://github.com/kabirdhillon7/Instagram/blob/master/Walkthrough.gif" width=250><br>
</details>

## Installation

To install and set up the app on your own device, follow these steps:

### Prerequisites
- Android Studio 4.0 or later
- Android SDK and Emulator or physical Android device for testing
- Java Development Kit (JDK) 8 or later installed and configured with Android Studio
- Gradle 4.0 or later for building the project

### Cloning the repository

- Download and install the latest version of Android Studio.
- Clone this repository to your local machine using the following command in your terminal:
```
git clone https://github.com/kabirdhillon7/Instagram.git
```
- Open Android Studio and click on "Open an existing Android Studio project".
- Navigate to the location where you cloned the repository, select the root folder of the project and click "OK".
- Wait for Android Studio to build the project and all its dependencies.
- Connect your Android device to your computer or use the Android emulator.
- In Android Studio, click on the "Run" button or press Shift+F10 to launch the app on your device.

## Dependencies

This app uses the following dependencies:

- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android

## Contact

If you have any questions or feedback, you can reach me through the following channels:

- GitHub: [@kabirdhillon7](https://github.com/kabirdhillon7)
- LinkedIn: [Kabir Dhillon](https://www.linkedin.com/in/kabirdhillon/)

## License

    Copyright 2021 Kabir Dhillon

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
