import requests

API_KEY = 'your_api_key_here'  # Get your API key from OpenWeatherMap
BASE_URL = 'http://api.openweathermap.org/data/2.5/weather'

def get_weather(city):
    params = {
        'q': city,
        'appid': API_KEY,
        'units': 'metric'
    }
    response = requests.get(BASE_URL, params=params)
    
    if response.status_code == 200:
        data = response.json()
        temp = data['main']['temp']
        weather_desc = data['weather'][0]['description']
        print(f"The temperature in {city} is {temp}°C with {weather_desc}.")
    else:
        print(f"Failed to get weather data for {city}. Please check the city name.")

def main():
    city = input("Enter city name: ")
    get_weather(city)

if __name__ == "__main__":
    main()
